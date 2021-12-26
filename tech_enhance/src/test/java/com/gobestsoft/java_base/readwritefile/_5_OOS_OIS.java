/*
 * Copyright 2020-2021, 木木996.
 * All Right Reserved.
 */

package com.gobestsoft.java_base.readwritefile;

import org.junit.Test;

import java.io.*;

/**
 * _5_OOS_OIS
 * 序列化流：ObjectOutputStream & ObjectInputStream
 * @author liuzhen
 * @version 1.0.0 2021/12/26 19:15
 */
public class _5_OOS_OIS {

    /**
     * 概述：Java 提供了一种对象序列化的机制。用一个字节序列可以表示一个对象，该字节序列包含该 对象的数据 、 对象的类型和对象中存储的属性等信息。 字节序列写出到文件之后，
     * 相当于文件中持久保存了一个对象的信息。 反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化。 对象的数据、对象的类型和对象中存储的数据信息，都可以用来在内存中创建对象。
     * 字节 -> 对象：ObjectOutputStream，序列化 -- 对象转换为字节
     * 对象 -> 字节：ObjectInputStream，反序列化 -- 字节重构为对象
     */

    /**
     * ObjectOutputStream类
     * java.io.ObjectOutputStream 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。
     * <p>
     * 构造方法 public ObjectOutputStream(OutputStream out) ： 创建一个指定OutputStream的ObjectOutputStream。
     * <p>
     * 序列化操作:
     * 1. 一个对象要想序列化，必须满足两个条件:
     * 该类必须实现 java.io.Serializable 接口， Serializable 是一个标记接口，不实现此接口的类将不会使任 何状态序列化或反序列化，会抛出 NotSerializableException 。
     * 该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，使用 transient 关键字修饰。
     * 2. 写出对象方法 public final void writeObject (Object obj) : 将指定的对象写出
     */
    @Test
    public void serializeDemo() {
        Employee employee = new Employee("zhangsan", "beiqinglu", 20);
        try {
            // 创建序列化流对象
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\test\\java\\com\\gobestsoft\\java_base\\readwritefile\\text\\employee.txt"));
            // 写出对象
            out.writeObject(employee);
            // 释放资源
            out.close();
            System.out.println("Serialized data is saved"); // 姓名，地址被序列化，年龄没有被序列化。
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    /**
     * ObjectInputStream类
     * ObjectInputStream反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象。
     * 构造方法 public ObjectInputStream(InputStream in)：创建一个指定InputStream的ObjectInputStream。
     *
     * 反序列化操作
     * 1. 如果能找到一个对象的class文件，我们可以进行反序列化操作，调用 ObjectInputStream 读取对象的方法。
     * 对于JVM可以反序列化对象，它必须是能够找到class文件的类。如果找不到该类的class文件，则抛出一个 ClassNotFoundException 异常。
     * 2. 另外，当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操 作也会失败，抛出一个 InvalidClassException 异常。
     * 发生这个异常的原因如下：
     *    该类的序列版本号与从流中读取的类描述符的版本号不匹配
     *    该类包含未知数据类型
     *    该类没有可访问的无参数构造方法
     * Serializable 接口给需要序列化的类，提供了一个序列版本号。 serialVersionUID 该版本号的目的在于验证序 列化的对象和对应类是否版本匹配。
     */
    @Test
    public void deSerializeDemo() {
        Employee e = null;
        try {
            // 创建反序列化流
            FileInputStream fis = new FileInputStream("src\\test\\java\\com\\gobestsoft\\java_base\\readwritefile\\text\\employee.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            // 读取一个对象
            e = (Employee)in.readObject();
            // 释放资源
            in.close();
            fis.close();
        } catch (IOException i) {
            // 捕获其他异常
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            // 捕获类找不到异常
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        // 无异常,直接打印输出
        System.out.println("Name: " + e.name); // zhangsan
        System.out.println("Address: " + e.address); // beiqinglu
        System.out.println("age: " + e.age); // 0

    }

}

class Employee implements Serializable {
    public String name;
    public String address;
    public transient int age; // transient瞬态修饰成员,不会被序列化
    // 添加新的属性 ,重新编译, 可以反序列化,该属性赋为默认值.
    // public int eid;

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void addressCheck() {
        System.out.println("Address check : " + name + " ‐‐ " + address);
    }
}

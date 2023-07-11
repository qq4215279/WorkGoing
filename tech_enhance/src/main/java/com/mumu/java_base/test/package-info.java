/*
 * Copyright 2020-2023, 木木996.
 * All Right Reserved.
 */

/**
 * package-info
 * 单元测试介绍
 * @author liuzhen
 * @version 1.0.0 2023/7/8 15:35
 */
package com.mumu.java_base.test;

/**
 * 知识点：
 * 一.、Junit单元测试：
 * 测试分类：
 1. 黑盒测试：不需要写代码，给输入值，看程序是否能够输出期望的值。
 2. 白盒测试：需要写代码的。关注程序具体的执行流程。

 * Junit使用：白盒测试
 * 步骤：
 1. 定义一个测试类(测试用例)
 * 建议：
 * 测试类名：被测试的类名Test		CalculatorTest
 * 包名：xxx.xxx.xx.test		cn.itcast.test

 2. 定义测试方法：可以独立运行
 * 建议：
 * 方法名：test测试的方法名		testAdd()
 * 返回值：void
 * 参数列表：空参

 3. 给方法加@Test
 4. 导入junit依赖环境

 * 判定结果：
 * 红色：失败
 * 绿色：成功
 * 一般我们会使用断言操作来处理结果
 * Assert.assertEquals(期望的结果, 运算的结果);

 * 补充：
 * @Before:
 * 修饰的方法会在测试方法之前被自动执行
 * @After:
 * 修饰的方法会在测试方法执行之后自动被执行
 *
 */
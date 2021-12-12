/*
 * Copyright 2020-2021, 木木996.
 * All Right Reserved.
 */

package com.mumu.dp3_2_command.test1.calculator;

// 加法类：请求接收者
public class Adder {
    // 定义初始值为0
    private int num = 0;

    // 加法操作，每次将传入的值与num作加法运算，再将结果返回
    public int add(int value) {
        num += value;
        return num;
    }
}

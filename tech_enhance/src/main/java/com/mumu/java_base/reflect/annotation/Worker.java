/*
 * Copyright 2020-2023, 木木996.
 * All Right Reserved.
 */

package com.mumu.java_base.reflect.annotation;

@MyAnno(value = 12, per = PersonEnum.P1, anno2 = @MyAnno2, strs = "bbb")
@MyAnno3
public class Worker {
    @MyAnno3
    public String name = "aaa";

    @MyAnno3
    public void show() {

    }
}

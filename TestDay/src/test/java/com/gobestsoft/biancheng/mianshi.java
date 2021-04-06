package com.gobestsoft.biancheng;

public class mianshi {

    /**
     * 题⽬： 在字符串A中找出所有字符串B（长度>1）出现的位置，大小写不计。 不限编程语言，但是不要使用字符串操作函数
     * （比如 substring()， indexof(),toLower(),toUpper() 等）。
     * --请一定要写出来，不要和面试官只讲思路。
     */
    public int test(String A, String B) {

        byte[] bytesA = A.getBytes();
        byte[] bytesB = B.getBytes();
        int count1 = 0;
        int count2 = 0;
        for (int a = 0, b = 0; a < A.length() && b < B.length(); ) {
            int c = bytesA[a];
            int d = bytesB[b];
            int flag = 0;
            if (c == d) {
                a++;
                b++;
                flag++;
                count1++;
            } else {
                a = a - flag;
                a++;
                b = 0;
                count2++;
                flag = 0;
            }
            if (b == B.length()) {
                return count1 + count2 - B.length() + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        mianshi mianshi = new mianshi();
        System.out.println(mianshi.test("abcde", "de"));//4
        System.out.println(mianshi.test("abcde", "c"));//3
        System.out.println(mianshi.test("abcdebc", "bcf"));//3
        System.out.println(mianshi.test("abcde", "g"));//0

    }

}

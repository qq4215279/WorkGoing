package com.mumu.dp2_5_facade;

public class Client {
    public static void main(String args[]) {
		/*
		EncryptFacade ef = new EncryptFacade();
		ef.fileEncrypt("src//designpatterns//facade//src.txt","src//designpatterns//facade//des.txt");
		*/
        AbstractEncryptFacade ef;
        ef = (AbstractEncryptFacade)XMLUtil.getBean();
        ef.fileEncrypt("src//designpatterns//facade//src.txt", "src//designpatterns//facade//des.txt");

    }
}

//designpatterns.bridge.Client.java
package com.mumu.bridge;

//�ͻ��˲�����
public class Client {
	public static void main(String args[]) {
		Image image;
		ImageImp imp;
		image = (Image)XMLUtil.getBean("image");
		imp = (ImageImp)XMLUtil.getBean("os");
		image.setImageImp(imp);
		image.parseFile("С��Ů");
	}
}

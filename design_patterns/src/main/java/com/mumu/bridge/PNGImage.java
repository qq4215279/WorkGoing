//designpatterns.bridge.PNGImage.java
package com.mumu.bridge;

//PNG��ʽͼ���࣬�䵱���������
public class PNGImage extends Image {
	public void parseFile(String fileName) {
      //ģ�����PNG�ļ������һ�����ؾ������m;
      Matrix m = new Matrix();
      imp.doPaint(m);
      System.out.println(fileName + "����ʽΪPNG��");
  }
}

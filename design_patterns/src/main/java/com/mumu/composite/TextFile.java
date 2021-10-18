//designpatterns.composite.TextFile.java
package com.mumu.composite;

public class TextFile extends AbstractFile {
	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	public void add(AbstractFile file) {
	   System.out.println("�Բ��𣬲�֧�ָ÷�����");
	}

	public void remove(AbstractFile file) {
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
	}

	public AbstractFile getChild(int i) {
		System.out.println("�Բ��𣬲�֧�ָ÷�����");
		return null;
	}

	public void killVirus() {
		//ģ��ɱ��
		System.out.println("----���ı��ļ�'" + name + "'����ɱ��");
	}
}

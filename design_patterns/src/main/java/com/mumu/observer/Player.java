//designpatterns.observer.Player.java
package com.mumu.observer;

//ս�ӳ�Ա�ࣺ����۲�����
public class Player implements Observer {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	//֧Ԯ���ѷ�����ʵ��
	public void help() {
		System.out.println("���ס��" + this.name + "�����㣡");
	}

	//���ܹ���������ʵ�֣������ܹ���ʱ������ս�ӿ����������֪ͨ����notifyObserver()��֪ͨ����
	public void beAttacked(AllyControlCenter acc) {
		System.out.println(this.name + "��������");
		acc.notifyObserver(name);
	}
}

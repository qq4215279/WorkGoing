//designpatterns.simplefactory.PieChart.java
package com.mumu.simplefactory;

//��״ͼ�࣬�䵱�����Ʒ��
public class PieChart implements Chart {
	public PieChart() {
		System.out.println("������״ͼ��");
	}

	public void display() {
		System.out.println("��ʾ��״ͼ��");
	}
}

//���������н�����
//designpatterns.mediator.SubConcreteMediator.java
package com.mumu.mediator;

public class SubConcreteMediator extends ConcreteMediator {
	//���Ӷ�Label���������
	public Label label;

	public void componentChanged(Component c) {
	    //������ť
		if (c == addButton) {
			System.out.println("--�������Ӱ�ť--");
			list.update();
			cb.update();
			userNameTextBox.update();
			label.update(); //�ı���ǩ����
		}
        //���б��ѡ��ͻ�
		else if (c == list) {
			System.out.println("--���б��ѡ��ͻ�--");
			cb.select();
			userNameTextBox.setText();
		}
        //����Ͽ�ѡ��ͻ�
		else if (c == cb) {
			System.out.println("--����Ͽ�ѡ��ͻ�--");
			cb.select();
			userNameTextBox.setText();
		}
	}
}

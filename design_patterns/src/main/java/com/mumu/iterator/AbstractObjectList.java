//designpatterns.iterator.AbstractObjectList.java
package com.mumu.iterator;
import java.util.*;

//����ۺ���
public abstract class AbstractObjectList {
	protected List<Object> objects = new ArrayList<Object>();

	public AbstractObjectList(List<Object> objects) {
		this.objects = objects;
	}

	public void addObject(Object obj) {
		this.objects.add(obj);
	}

	public void removeObject(Object obj) {
		this.objects.remove(obj);
	}

	public List<Object> getObjects() {
		return this.objects;
	}

	//������������������ĳ��󹤳�����
	public abstract AbstractIterator createIterator();
}

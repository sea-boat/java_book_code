package com.java.generics;

public class GenericsTest22 {

	public static void main(String[] args) {
		//����ǰ�ķ��ʹ���
		KeyValue<String, Integer> kv = new KeyValue<String, Integer>("С��", 20);
		String key = kv.getKey();
		Integer value = kv.getValue();
		//����������ִ�еĴ���
		KeyValue2 kv2 = new KeyValue2("С��", 20);
		String key2 = (String) kv2.getKey();
		Integer value2 = (Integer) kv2.getValue();
	}
}

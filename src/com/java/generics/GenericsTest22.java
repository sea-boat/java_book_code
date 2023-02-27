package com.java.generics;

public class GenericsTest22 {

	public static void main(String[] args) {
		//擦除前的泛型代码
		KeyValue<String, Integer> kv = new KeyValue<String, Integer>("小明", 20);
		String key = kv.getKey();
		Integer value = kv.getValue();
		//擦除后真正执行的代码
		KeyValue2 kv2 = new KeyValue2("小明", 20);
		String key2 = (String) kv2.getKey();
		Integer value2 = (Integer) kv2.getValue();
	}
}

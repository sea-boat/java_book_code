package com.java.generics;

public class GenericsTest5 {

	public static void main(String[] args) {
		int i = 10;
//		Value<int> v = new Value<int>();
	}

}

class Value<T> {
	T arr;

	public Value(T arr) {
		this.arr = arr;
	}
}

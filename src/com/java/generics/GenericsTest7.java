package com.java.generics;

public class GenericsTest7 {

	public static void main(String[] args) {
		String data2 = "hello world";
		Info data3 = new Info("200", true);
		Result<String> r2 = new Result<String>(data2);
		Result<Info> r3 = new Result<Info>(data3);
		System.out.println(r2);
		System.out.println(r3);
	}

}

class Result<T> {
	T data;

	public Result(T t) {
		this.data = t;
	}

	public String toString() {
		return data.toString();
	}
}

class Info {
	String code;
	boolean isSuccess;

	public Info(String s, boolean b) {
		this.code = s;
		this.isSuccess = b;
	}

	public String toString() {
		return code + "-" + isSuccess;
	}
}
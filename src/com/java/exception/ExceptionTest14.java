package com.java.exception;

public class ExceptionTest14 {

	public static void main(String[] args) throws MyException {
		System.out.println(new MyException("自定义异常信息").getMessage());
		throw new MyException("自定义异常信息");
	}

}

class MyException extends Throwable {
	public MyException() {
		super();
	}

	public MyException(String s) {
		super(s);
	}
}

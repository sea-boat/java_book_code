package com.java.exception;

public class ExceptionTest14 {

	public static void main(String[] args) throws MyException {
		System.out.println(new MyException("�Զ����쳣��Ϣ").getMessage());
		throw new MyException("�Զ����쳣��Ϣ");
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

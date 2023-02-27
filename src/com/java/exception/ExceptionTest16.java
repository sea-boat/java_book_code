package com.java.exception;

public class ExceptionTest16 {
	static String NAME = "admin";
	static String PWD = "123";

	public static void main(String[] args) {
		try {
			login("admin", "123");
			login("admin", "1234");
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}

	public static boolean login(String name, String password) {
		if (NAME.equals(name) && PWD.equals(password))
			return true;
		throw new LoginException("用户名或密码错误");
	}
}

class LoginException extends RuntimeException {
	public LoginException() {
		super();
	}

	public LoginException(String info) {
		super(info);
	}
}

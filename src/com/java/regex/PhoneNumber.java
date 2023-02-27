package com.java.regex;

public class PhoneNumber {

	public static void main(String[] args) {
		System.out.println(isValidPhoneNumber("13760708870"));
		System.out.println(isValidPhoneNumber("137607080870"));
		System.out.println(isValidPhoneNumber("137607sdf70"));
		System.out.println(isValidPhoneNumber("33760745670"));
	}

	public static boolean isValidPhoneNumber(String number) {
		if (number.length() != 11)
			return false;
		if (!number.startsWith("1"))
			return false;
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) < '0' || number.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isValidPhoneNumber2(String number) {
		return number.matches("1\\d{10}");
	}

}

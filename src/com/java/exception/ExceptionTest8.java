package com.java.exception;

public class ExceptionTest8 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			arr[10] = 100;
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.java.exception;

public class ExceptionTest9 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			arr[10] = 100;
		} catch (Exception e) {
			e.printStackTrace();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
		}
	}

}

package com.java.exception;

public class ExceptionTest7 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			arr[10] = 100;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("���e.toString()��");
			System.out.println(e.toString());
			System.out.println("���e.getMessage()��");
			System.out.println(e.getMessage());
			System.out.println("ֱ�ӵ���e.printStackTrace()��");
			e.printStackTrace();
		}
	}

}

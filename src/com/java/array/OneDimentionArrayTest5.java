package com.java.array;

public class OneDimentionArrayTest5 {
	public static void main(String[] args) {
		String[] arr = new String[] { "java", "c++", "python", "nodejs", "js", "rust" };
		//��һ��д��
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		//�ڶ���д��
		for (String s : arr)
			System.out.println(s);
	}
}

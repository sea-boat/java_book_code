package com.java.array;

public class OneDimentionArrayTest5 {
	public static void main(String[] args) {
		String[] arr = new String[] { "java", "c++", "python", "nodejs", "js", "rust" };
		//第一种写法
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		//第二种写法
		for (String s : arr)
			System.out.println(s);
	}
}

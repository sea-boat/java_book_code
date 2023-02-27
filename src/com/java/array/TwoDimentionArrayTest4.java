package com.java.array;

public class TwoDimentionArrayTest4 {
	public static void main(String[] args) {
		String[][] arr = { { "java", "编程", "c++", "编程", "python", "语言" },
				{ "c#", "it", "技术", "计算机", "屏幕", "鼠标" },
				{ "软件", "硬件", "服务器", "浏览器", "编译", "虚拟机" } };
		//第一种方式
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				System.out.println(arr[i][j]);
		//第二种方式
		for (String[] oneArr : arr)
			for (String s : oneArr)
				System.out.println(s);
	}
}

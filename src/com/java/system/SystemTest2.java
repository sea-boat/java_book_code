package com.java.system;

public class SystemTest2 {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			long start = System.nanoTime();
			//计时开始
			int count = 0;
			for (int j = 1; j <= 100; j++)
				count += j;
			//计时结束
			long end = System.nanoTime();
			System.out.println("第" + i + "次耗时：" + (end - start));
		}
	}
}

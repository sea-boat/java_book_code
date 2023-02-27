package com.java.random;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		long seed = 1000;
		Random r = new Random();
		Random r2 = new Random(seed);
		System.out.println("返回int型范围的随机整数：" + r.nextInt());
		System.out.println("返回[0,100)范围的随机整数：" + r.nextInt(100));
		System.out.println("返回long型范围的随机整数：" + r.nextLong());
		System.out.println("随机返回true或false：" + r.nextBoolean());
		System.out.println("返回float型范围的随机浮点数：" + r.nextFloat());
		System.out.println("返回double型范围的随机浮点数：" + r.nextDouble());
		System.out.println("返回正态分布的随机浮点数：" + r.nextGaussian());
	}
}

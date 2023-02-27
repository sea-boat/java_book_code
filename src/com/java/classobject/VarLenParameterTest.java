package com.java.classobject;

public class VarLenParameterTest {

	//	public int sum(int a, int b) {
	//		return a + b;
	//	}
	//
	//	public int sum(int a, int b, int c) {
	//		return a + b + c;
	//	}

	public int sum(int... nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++)
			result += nums[i];
		return result;
	}

	public int sum(float f, int... nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++)
			result += nums[i];
		return result;
	}

	public static void main(String[] args) {
		VarLenParameterTest vpt = new VarLenParameterTest();
		System.out.println(vpt.sum(10, 20));
		System.out.println(vpt.sum(10, 20, 30));
		System.out.println(vpt.sum(10, 20, 30, 40));
		System.out.println(vpt.sum(10, 20, 30, 40, 50));
	}

}

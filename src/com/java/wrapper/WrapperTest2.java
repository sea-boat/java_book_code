package com.java.wrapper;

public class WrapperTest2 {
	public static void main(String[] args) {
		//手动转换
		int i = 100;
		Integer intI = Integer.valueOf(i);
		//自动装箱
		Integer intI2 = 100;

		//手动转换
		int ii = intI.intValue();
		//自动拆箱
		int iii = intI2;

	}
}

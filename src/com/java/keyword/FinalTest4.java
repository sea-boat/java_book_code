package com.java.keyword;

public class FinalTest4 {
	int a = 10;
	static final FinalTest4 ft4 = new FinalTest4();

	public static void main(String[] args) {
		FinalTest4 ft = new FinalTest4();
		FinalTest4.ft4.a = 20;//可以修改属性值
//		FinalTest4.ft4 = ft;//不能重新赋值
	}
}

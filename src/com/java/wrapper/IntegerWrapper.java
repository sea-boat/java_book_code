package com.java.wrapper;

public class IntegerWrapper {
	private int value;

	public IntegerWrapper(int value) {
		this.value = value;
	}

	public int intValue() {
		return this.value;
	}

	//�����ܶ����õķ���

	public static void main(String[] args) {
		IntegerWrapper i = new IntegerWrapper(10);
		i.intValue();
	}
}

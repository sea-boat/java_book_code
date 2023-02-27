package com.java.innerclass;

public class MemberInnerClassTest {

	public String str = "hello";

	class InnerClass {
		public void print() {
			System.out.println(str + " from inner class.");
			System.out.println(MemberInnerClassTest.this.str);
		}
	}

	public static void main(String[] args) {
		MemberInnerClassTest mict = new MemberInnerClassTest();
		MemberInnerClassTest.InnerClass inner = mict.new InnerClass();
		inner.print();
	}
}

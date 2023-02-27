package com.java.keyword;

public class FinalTest2 extends FinalMethod {

	void print() {
		System.out.println("重写print方法");
	}

}

class FinalMethod {
	/*final*/ void print() {
		System.out.println("该方法不能被重写");
	}
}
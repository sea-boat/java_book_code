package com.java.function;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "test";
		};
		Supplier<Integer> supplier2 = () -> (int) (Math.random() * 100);
		Supplier<Integer[]> supplier3 = () -> new Integer[] { 4, 2, 6 };
		System.out.println(supplier.get());
		System.out.println(supplier2.get());
		System.out.println(Arrays.toString(supplier3.get()));
	}

}

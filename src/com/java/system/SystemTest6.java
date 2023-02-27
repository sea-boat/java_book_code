package com.java.system;

public class SystemTest6 {
	public static void main(String args[]) {
		String[] source = { "ÀºÇò", "×ãÇò", "±ùÇò", "Æ¹ÅÒÇò", "ÍøÇò", "ÓğÃ«Çò", "±£ÁäÇò" };
		String[] destination = new String[5];
		System.arraycopy(source, 3, destination, 2, 3);
		for (int i = 0; i < destination.length; i++)
			System.out.println(destination[i]);
	}
}

package com.java.system;

public class SystemTest2 {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			long start = System.nanoTime();
			//��ʱ��ʼ
			int count = 0;
			for (int j = 1; j <= 100; j++)
				count += j;
			//��ʱ����
			long end = System.nanoTime();
			System.out.println("��" + i + "�κ�ʱ��" + (end - start));
		}
	}
}

package com.java.array;

public class TwoDimentionArrayTest4 {
	public static void main(String[] args) {
		String[][] arr = { { "java", "���", "c++", "���", "python", "����" },
				{ "c#", "it", "����", "�����", "��Ļ", "���" },
				{ "���", "Ӳ��", "������", "�����", "����", "�����" } };
		//��һ�ַ�ʽ
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				System.out.println(arr[i][j]);
		//�ڶ��ַ�ʽ
		for (String[] oneArr : arr)
			for (String s : oneArr)
				System.out.println(s);
	}
}

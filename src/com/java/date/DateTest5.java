package com.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest5 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("MM��dd��");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("HHСʱmm����ss��SS����");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("���������绹�����磿a");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("��ǰ��ʱ����Z");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("�������ܼ���E");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("������һ���еĵ�D�죬��w��");
		System.out.println(sdf.format(date));
	}
}

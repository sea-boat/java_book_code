package com.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest3 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:/java/test.txt");
		System.out.println("�ļ��Ƿ��п�ִ��Ȩ�ޣ�" + f.canExecute());
		System.out.println("�ļ��Ƿ�ɶ���" + f.canRead());
		System.out.println("�ļ��Ƿ��д��" + f.canWrite());
		System.out.println("�Ƿ�Ϊ����·����" + f.isAbsolute());
		System.out.println("�Ƿ�ΪĿ¼��" + f.isDirectory());
		System.out.println("�Ƿ�Ϊ�ļ�" + f.isFile());
		System.out.println("�Ƿ�Ϊ�����ļ���" + f.isHidden());
		System.out.println("�ļ�����޸�ʱ�䣺" + new Date(f.lastModified()));
		System.out.println("�ļ���С��" + f.length());
		System.out.println("�ļ��ľ���·��Ϊ��" + f.getAbsolutePath());
		System.out.println("�ļ��ı�׼·��Ϊ��" + f.getCanonicalPath());
		System.out.println("�ļ���Ϊ��" + f.getName());
		System.out.println("��Ŀ¼·��Ϊ��" + f.getParent());
		System.out.println("���췽�������·��Ϊ��" + f.getPath());
	}
}

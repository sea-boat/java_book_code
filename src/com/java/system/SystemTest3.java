package com.java.system;

public class SystemTest3 {
	public static void main(String args[]) {
		System.out.println("Java�汾��" + System.getProperty("java.version"));
		System.out.println("Java���̣�" + System.getProperty("java.vendor"));
		System.out.println("Java������ַ��" + System.getProperty("java.vendor.url"));
		System.out.println("Java��װĿ¼��" + System.getProperty("java.home"));
		System.out.println("Java�淶�汾��" + System.getProperty("java.specification.version"));
		System.out.println("Java�淶���̣�" + System.getProperty("java.specification.vendor"));
		System.out.println("Java�淶���ƣ�" + System.getProperty("java.specification.name"));
		System.out.println("Java��汾�ţ�" + System.getProperty("java.class.version"));
		System.out.println("Java��·����" + System.getProperty("java.class.path"));
		System.out.println("Java��·����" + System.getProperty("java.library.path"));
		System.out.println("Java��ʱ·����" + System.getProperty("java.io.tmpdir"));
		System.out.println("����ϵͳ���ƣ�" + System.getProperty("os.name"));
		System.out.println("����ϵͳ�ļܹ���" + System.getProperty("os.arch"));
		System.out.println("����ϵͳ�汾�ţ�" + System.getProperty("os.version"));
		System.out.println("�ļ��ָ�����" + System.getProperty("file.separator"));
		System.out.println("����ϵͳ�û�����" + System.getProperty("user.name"));
		System.out.println("����ϵͳ�û���Ŀ¼��" + System.getProperty("user.home"));
		System.out.println("��ǰ����Ŀ¼��" + System.getProperty("user.dir"));
	}
}

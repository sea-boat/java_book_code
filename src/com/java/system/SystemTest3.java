package com.java.system;

public class SystemTest3 {
	public static void main(String args[]) {
		System.out.println("Java版本：" + System.getProperty("java.version"));
		System.out.println("Java厂商：" + System.getProperty("java.vendor"));
		System.out.println("Java厂商网址：" + System.getProperty("java.vendor.url"));
		System.out.println("Java安装目录：" + System.getProperty("java.home"));
		System.out.println("Java规范版本：" + System.getProperty("java.specification.version"));
		System.out.println("Java规范厂商：" + System.getProperty("java.specification.vendor"));
		System.out.println("Java规范名称：" + System.getProperty("java.specification.name"));
		System.out.println("Java类版本号：" + System.getProperty("java.class.version"));
		System.out.println("Java类路径：" + System.getProperty("java.class.path"));
		System.out.println("Java库路径：" + System.getProperty("java.library.path"));
		System.out.println("Java临时路径：" + System.getProperty("java.io.tmpdir"));
		System.out.println("操作系统名称：" + System.getProperty("os.name"));
		System.out.println("操作系统的架构：" + System.getProperty("os.arch"));
		System.out.println("操作系统版本号：" + System.getProperty("os.version"));
		System.out.println("文件分隔符：" + System.getProperty("file.separator"));
		System.out.println("操作系统用户名：" + System.getProperty("user.name"));
		System.out.println("操作系统用户主目录：" + System.getProperty("user.home"));
		System.out.println("当前工作目录：" + System.getProperty("user.dir"));
	}
}

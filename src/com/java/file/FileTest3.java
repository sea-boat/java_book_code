package com.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest3 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:/java/test.txt");
		System.out.println("文件是否有可执行权限：" + f.canExecute());
		System.out.println("文件是否可读：" + f.canRead());
		System.out.println("文件是否可写：" + f.canWrite());
		System.out.println("是否为绝对路径：" + f.isAbsolute());
		System.out.println("是否为目录：" + f.isDirectory());
		System.out.println("是否为文件" + f.isFile());
		System.out.println("是否为隐藏文件：" + f.isHidden());
		System.out.println("文件最后修改时间：" + new Date(f.lastModified()));
		System.out.println("文件大小：" + f.length());
		System.out.println("文件的绝对路径为：" + f.getAbsolutePath());
		System.out.println("文件的标准路径为：" + f.getCanonicalPath());
		System.out.println("文件名为：" + f.getName());
		System.out.println("父目录路径为：" + f.getParent());
		System.out.println("构造方法传入的路径为：" + f.getPath());
	}
}

package com.java.annotation;

import java.io.IOException;

/**
 * @author seaboat <br>
 * <a href = {@docRoot}>根目录</a>
 * @see com.java.annotation.BBB <br>
 * @since 9
 * @version 1.0
 */
public class AnnotationJavadocTest extends BBB {
	
	/**
	 * @param flag int 整型参数<br>
	 * @param s String 字符串参数<br>
	 * @return value String 方法返回值<br>
	 * @deprecated<br>
	 * @since 9<br>
	 * @exception IOException 当传入参数值为0时抛出该异常<br>
	 * @throws IOException 当传入参数值为0时抛出该异常<br>
	*/
	public String test(int flag, String s) throws IOException {
		if (flag == 0)
			throw new IOException();
		return "Hello";
	}

	/**
	 * {@inheritDoc}
	 * 链接到BB父类test2(String s)方法{@link com.java.annotation.BBB#test2(java.lang.String)}<br>
	 * {@linkplain com.java.annotation.BBB#test2(java.lang.String) 链接到BB父类test2(String s)方法}<br>
	 * @see com.java.annotation.BBB#test2(String)
	 */
	@Override
	public void test2(String s) {

	}
	
}

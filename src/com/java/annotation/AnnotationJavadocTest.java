package com.java.annotation;

import java.io.IOException;

/**
 * @author seaboat <br>
 * <a href = {@docRoot}>��Ŀ¼</a>
 * @see com.java.annotation.BBB <br>
 * @since 9
 * @version 1.0
 */
public class AnnotationJavadocTest extends BBB {
	
	/**
	 * @param flag int ���Ͳ���<br>
	 * @param s String �ַ�������<br>
	 * @return value String ��������ֵ<br>
	 * @deprecated<br>
	 * @since 9<br>
	 * @exception IOException ���������ֵΪ0ʱ�׳����쳣<br>
	 * @throws IOException ���������ֵΪ0ʱ�׳����쳣<br>
	*/
	public String test(int flag, String s) throws IOException {
		if (flag == 0)
			throw new IOException();
		return "Hello";
	}

	/**
	 * {@inheritDoc}
	 * ���ӵ�BB����test2(String s)����{@link com.java.annotation.BBB#test2(java.lang.String)}<br>
	 * {@linkplain com.java.annotation.BBB#test2(java.lang.String) ���ӵ�BB����test2(String s)����}<br>
	 * @see com.java.annotation.BBB#test2(String)
	 */
	@Override
	public void test2(String s) {

	}
	
}

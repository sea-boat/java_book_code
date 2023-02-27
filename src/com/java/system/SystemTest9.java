package com.java.system;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SystemTest9 {
	public static void main(String args[]) throws IOException {
		InputStream is = System.in;
		Reader r = new InputStreamReader(is);
		char[] chs = new char[1024];
		int len = 0;
		while ((len = r.read(chs)) != -1) {
			char[] cc = new char[len];
			for (int i = 0; i < len; i++)
				cc[i] = chs[i];
			String str = new String(cc);
			System.out.println("¼üÅÌÊäÈëµÄ×Ö·û´®Îª£º" + str);
		}
		is.close();
	}
}

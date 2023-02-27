package com.java.wrapper;

public class WrapperTest3 {
	public static void main(String[] args) {
		//字符串转为包装类
		Byte byteB = Byte.parseByte("127");
		Short shortS = Short.parseShort("1000");
		Integer intI = Integer.parseInt("10");
		Long longL = Long.parseLong("2000000000000");
		Float floatF = Float.parseFloat("6.5F");
		Double doubleD = Double.parseDouble("7.5D");
		Boolean boolB = Boolean.parseBoolean("true");

		//包装类转为字符串
		String byteStr = String.valueOf(byteB);
		String shortStr = String.valueOf(shortS);
		String intStr = String.valueOf(intI);
		String longStr = String.valueOf(longL);
		String floatStr = String.valueOf(floatF);
		String doubleStr = String.valueOf(doubleD);
		String boolStr = String.valueOf(boolB);

	}
}

package com.java.socket;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.baidu.com");
			System.out.println("����Ϊ��" + address.getHostName());
			System.out.println("IP ��ַΪ��" + address.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

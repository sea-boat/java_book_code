package com.java.socket;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("www.baidu.com");
			System.out.println("域名为：" + address.getHostName());
			System.out.println("IP 地址为：" + address.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.java.socket;

import java.net.InetAddress;

public class InetAddressTest2 {
	public static void main(String[] args) {
		try {
			InetAddress[] addresses = InetAddress.getAllByName("www.taobao.com");
			for (int i = 0; i < addresses.length; i++)
				System.out.println(addresses[i].getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

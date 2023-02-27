package com.java.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSocketSender {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("192.168.0.255");
			DatagramSocket ds = new DatagramSocket();
			String str = "hello";
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, ip, 8888);
			System.out.println("开始发送广播数据");
			ds.send(dp);
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

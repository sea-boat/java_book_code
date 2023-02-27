package com.java.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSocketClient {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("localhost");
			DatagramSocket ds = new DatagramSocket();
			ds.connect(ip, 8888);
			byte[] data = "hello".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("开始发送数据");
			ds.send(dp);
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

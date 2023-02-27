package com.java.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPSocketServer {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(8888);
			byte[] buf = new byte[5];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			System.out.println("开始等待接收数据");
			ds.receive(dp);
			System.out.println("接收到数据：" + new String(buf));
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

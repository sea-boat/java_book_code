package com.java.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPSocketClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("localhost", 8888);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			System.out.println("准备向服务端发送数据");
			dos.writeUTF("我是客户端!");
			System.out.println("准备读取服务端数据");
			System.out.println(dis.readUTF());
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

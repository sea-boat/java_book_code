package com.java.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSocketServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("服务端套接字正在等待客户端的连接");
			Socket socket = serverSocket.accept();
			System.out.println("成功接收一个客户端套接字连接");
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			System.out.println("客户端发送的数据：" + dis.readUTF());
			dos.writeUTF("你好，客户端！");
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.java.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPSocketClient2 {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("localhost", 8888);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			String message = "";
			Scanner scanner = new Scanner(System.in);
			while (true) {
				message = scanner.nextLine();
				dos.writeUTF(message);
				if (message.equals("stop"))
					break;
			}
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

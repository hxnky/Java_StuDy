package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCPIPMultiChatClient {

	public static void main(String[] args) {

		// Socket 연결
		try {
			String serverIP = "127.0.0.1"; // localhost --> 호스트 자신의 주소
			Socket socket = new Socket(serverIP, 7777);
			
			// 메세지를 보내는 쓰래드
			Thread sender = new ClientSenderThread(socket, "손흥민");
			// 메세지를 받는 쓰래드
			Thread receiver = new ClientReceiver(socket);
			
			sender.start();
			receiver.start();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class ClientSenderThread extends Thread {

	// 보내기 쓰래드는 Socket, OuputStream, name이 필요
	Socket socket;
	DataOutputStream out;
	String name;

	public ClientSenderThread(Socket s, String name) {
		this.socket = socket;

		try {
			out = new DataOutputStream(s.getOutputStream());
			this.name = name;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);

		try {
			// 접속하면 서버에 바로 이름 전송
			if (out != null) {
				out.writeUTF(name);
			}

			while (out != null) {
				out.writeUTF("[" + name + "]" + sc.nextLine());
			}

		} catch (IOException e) {

		}
	}

}

class ClientReceiver extends Thread {

	// 쓰래드 역할 : 메시지를 받아서 콘솔에 출력
	// Socket, InputStream이 필요
	Socket socket;
	DataInputStream in;

	public ClientReceiver(Socket socket) {
		this.socket = socket;

		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
		}

	}

	@Override
	public void run() {
		while (in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
			}
		}
	}

}
package server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
class UserThread extends Thread{
	Socket sock = null;
	public UserThread(Socket sock) {
		System.out.println(sock.getInetAddress() + " ���� �����߽��ϴ�.");
		this.sock = sock;
		start();
	}
	public void run() {
		InputStream in;
		String readData = null;
		try {
			in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			readData = dis.readUTF();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ������ : " + readData);
	}
}
public class Server06 {
	public static void main(String[] args) throws Exception{
		ServerSocket server  = new ServerSocket(1234);
		while(true) {
			System.out.println("������ ��ٸ��ϴ�");
			Socket sock = server.accept();
			new UserThread(sock);
		}
	}
}
*/
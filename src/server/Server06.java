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
		System.out.println(sock.getInetAddress() + " 님이 접속했습니다.");
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
		System.out.println("수신 데이터 : " + readData);
	}
}
public class Server06 {
	public static void main(String[] args) throws Exception{
		ServerSocket server  = new ServerSocket(1234);
		while(true) {
			System.out.println("접속을 기다립니다");
			Socket sock = server.accept();
			new UserThread(sock);
		}
	}
}
*/
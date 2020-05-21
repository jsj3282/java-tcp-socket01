package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
		int num = (int) (Math.random()*100)+1;
		System.out.println(num);
		InputStream in;
		String readData = null;
		String writeData = null;
		boolean flag = true;
		try {
			while(flag) {
				in = sock.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				readData = dis.readUTF();
				int readData2 = Integer.parseInt(readData);
				OutputStream out = sock.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				if(readData2 > num) {
					writeData = "down";
					dos.writeUTF(writeData);
					System.out.println(writeData);
				}else if(readData2 < num) {
					writeData = "up";
					dos.writeUTF(writeData);
					System.out.println(writeData);
				}else {
					writeData = "성공";
					dos.writeUTF(writeData);
					System.out.println(writeData);
					flag = false;
					out.close();
					dos.close();
					sock.close();
				}
			}
			

		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("수신 데이터 : " + readData);
	}
}

public class Server07 {
	//updown 게임
	public static void main(String[] args) throws IOException {
		ServerSocket server  = new ServerSocket(123);
		while(true) {
			System.out.println("접속을 기다립니다");
			Socket sock = server.accept();
			new UserThread(sock);
		}
	}
}
*/
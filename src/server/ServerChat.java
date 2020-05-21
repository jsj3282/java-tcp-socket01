package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class UserThread extends Thread{
	Socket sock1 = null;
	Socket sock2 = null;
	Socket sock3 = null;
	public UserThread(Socket sock1, Socket sock2, Socket sock3) {
		System.out.println(sock1.getInetAddress() + " 님이 접속했습니다.");
		System.out.println(sock2.getInetAddress() + " 님이 접속했습니다.");
		System.out.println(sock3.getInetAddress() + " 님이 접속했습니다.");
		System.out.println("채팅시작");
		this.sock1 = sock1;
		this.sock2 = sock2;
		this.sock3 = sock3;
		
		start();
	}
	public void run() {
		String readData1 = null;
		String writeData1 = null;
		String readData2 = null;
		String writeData2 = null;
		String readData3 = null;
		String writeData3 = null;
		OutputStream out1 = null;
		try {
			out1 = sock1.getOutputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DataOutputStream dos1 = new DataOutputStream(out1);
		OutputStream out2 = null;
		try {
			out2 = sock2.getOutputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DataOutputStream dos2 = new DataOutputStream(out2);
		OutputStream out3 = null;
		try {
			out3 = sock3.getOutputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DataOutputStream dos3 = new DataOutputStream(out3);
		try {
			while(true) {
				InputStream in1 = sock1.getInputStream();
				DataInputStream dis1 = new DataInputStream(in1);
				readData1 = dis1.readUTF();
//				OutputStream out1 = sock1.getOutputStream();
//				DataOutputStream dos1 = new DataOutputStream(out1);
				dos1.writeUTF("1번 클라이언트 : " + readData1);
				dos2.writeUTF("1번 클라이언트 : " + readData1);
				dos3.writeUTF("1번 클라이언트 : " + readData1);
				
				InputStream in2 = sock2.getInputStream();
				DataInputStream dis2 = new DataInputStream(in2);
				readData2 = dis2.readUTF();
//				OutputStream out2 = sock2.getOutputStream();
//				DataOutputStream dos2 = new DataOutputStream(out2);
				dos2.writeUTF("2번 클라이언트 : " + readData2);
				dos1.writeUTF("2번 클라이언트 : " + readData2);
				dos3.writeUTF("2번 클라이언트 : " + readData2);
			
				InputStream in3 = sock3.getInputStream();
				DataInputStream dis3 = new DataInputStream(in3);
				readData3 = dis3.readUTF();
//				OutputStream out3 = sock3.getOutputStream();
//				DataOutputStream dos3 = new DataOutputStream(out3);
				dos3.writeUTF("3번 클라이언트 : " + readData3);
				dos1.writeUTF("3번 클라이언트 : " + readData3);
				dos2.writeUTF("3번 클라이언트 : " + readData3);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
public class ServerChat {
	public static void main(String[] args) throws Exception{
		ServerSocket server  = new ServerSocket(1234);
		while(true) {
			System.out.println("접속을 기다립니다");
			Socket sock1 = server.accept();
			Socket sock2 = server.accept();
			Socket sock3 = server.accept();
			new UserThread(sock1, sock2, sock3);
		}
	}
}

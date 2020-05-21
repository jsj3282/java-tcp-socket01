package server;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server03 {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(12345);
		Socket sock = server.accept();
		InetAddress inetaddr = sock.getInetAddress();
		System.out.println(inetaddr.getHostAddress()+"�κ��� �����߽��ϴ�.");		//�Ʒ����� Ÿ���� �ٸ�
		System.out.println(sock.getInetAddress() + "���� �����߽��ϴ�.");
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		
		System.out.println("���� ������ : " + readData);
		
		dis.close();
		in.close();
		sock.close();
	}
}

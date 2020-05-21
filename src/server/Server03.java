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
		System.out.println(inetaddr.getHostAddress()+"로부터 접속했습니다.");		//아래와의 타입이 다름
		System.out.println(sock.getInetAddress() + "님이 접속했습니다.");
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		
		System.out.println("수신 데이터 : " + readData);
		
		dis.close();
		in.close();
		sock.close();
	}
}

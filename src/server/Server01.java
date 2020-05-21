package server;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);		//서버소켓생성 0 ~ 65535
		System.out.println("접속을 기다립니다!!!");
		Socket sock = server.accept();		//접속대기
		Socket sock01 = server.accept();
		//여기서 소켓은 클라이언트에 대한 소켓
		System.out.println("접속 되었습니다!!!");
		
		InetAddress inetaddr = sock.getInetAddress();
		System.out.println(inetaddr.getHostAddress());	//누가 접속했는지 알려줌
		
		InputStream in = sock.getInputStream();		//수신할 값을 만듦
		System.out.println("서버 데이터 수신 대기중...");
		int readData = in.read();
		System.out.println("수신 데이터 : " + readData);
		
		
	}
}

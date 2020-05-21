package server;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(12345);
		Socket sock = server.accept();
		InputStream in = sock.getInputStream();
		InputStreamReader inputread = new InputStreamReader(in);
		
		char readData[] = new char[100];
		for(int i = 0; i < readData.length; i++) {
			readData[i] = 0;
		}
		inputread.read(readData);
		/*
		for(int i = 0; i < readData[i]; i++) {			//readData[i]인 이유는 readData[i]가 문자이므로 0보다 크다
			System.out.println((int)readData[i]);
		}
		*/
		
		String strData;
		strData = String.valueOf(readData);
		System.out.println("수신 데이터 : " + strData);
		
		inputread.close();
		in.close();
		sock.close();
	}
}

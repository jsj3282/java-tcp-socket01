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
		for(int i = 0; i < readData[i]; i++) {			//readData[i]�� ������ readData[i]�� �����̹Ƿ� 0���� ũ��
			System.out.println((int)readData[i]);
		}
		*/
		
		String strData;
		strData = String.valueOf(readData);
		System.out.println("���� ������ : " + strData);
		
		inputread.close();
		in.close();
		sock.close();
	}
}

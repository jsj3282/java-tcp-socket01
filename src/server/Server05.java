package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server05 {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(12345);
		Socket sock = server.accept();
		InputStream in = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		
		String readData;
		try {
			readData = (String)ois.readObject();
			System.out.println("수신 데이터 : " + readData);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		in.close();
		sock.close();
				
	}
}

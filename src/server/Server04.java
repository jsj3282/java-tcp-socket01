package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server04 {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(12345);
		Socket sock = server.accept();
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(readData);
		
		dos.close();
		out.close();
		dis.close();
		in.close();
		sock.close();
		
		
	}
}

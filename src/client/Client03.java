package client;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client03 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 12345);
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		System.out.println("송신 문자열 입력 : ");
		String data = input.next();
		dos.writeUTF(data);
		
		dos.close();
		out.close();
		sock.close();
	}
}

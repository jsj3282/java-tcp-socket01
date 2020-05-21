package client;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 12345);
		
		OutputStream out = sock.getOutputStream();
		OutputStreamWriter outputWriter = new OutputStreamWriter(out);	//Byte ���·� ó��
		
		System.out.print("���ڿ� �Է� : ");
		String str;
		str = input.nextLine();
		out.write(str.getBytes());
		
		outputWriter.close();
		out.close();
		sock.close();
	}
}

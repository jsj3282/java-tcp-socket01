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
		OutputStreamWriter outputWriter = new OutputStreamWriter(out);	//Byte 형태로 처리
		
		System.out.print("문자열 입력 : ");
		String str;
		str = input.nextLine();
		out.write(str.getBytes());
		
		outputWriter.close();
		out.close();
		sock.close();
	}
}

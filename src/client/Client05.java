package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client05 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 12345);
		OutputStream out = sock.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		System.out.print("문자열 입력 : ");
		String str;
		str = input.nextLine();
		oos.writeObject(str);
		
		oos.close();
		out.close();
		sock.close();
	}
}

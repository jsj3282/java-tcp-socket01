package client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("192.168.0.28", 20000);//접속하고자하는 IP, 포트(여기서는 PC한대이므로 자기 자신)
		
		OutputStream out = sock.getOutputStream();
		System.out.print("수 입력 : ");
		int data = input.nextInt();
		out.write(data);
		
		out.close();
		sock.close();
	}
}

package client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 12345);//�����ϰ����ϴ� IP, ��Ʈ(���⼭�� PC�Ѵ��̹Ƿ� �ڱ� �ڽ�)
		
		OutputStream out = sock.getOutputStream();
		System.out.print("�� �Է� : ");
		int data = input.nextInt();
		out.write(data);
		
		out.close();
		sock.close();
	}
}

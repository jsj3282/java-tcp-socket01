package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client04 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 12345);
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		System.out.print("�۽� ���ڿ� �Է� : ");
		String data = input.next();
		dos.writeUTF(data);
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		String newData = dis.readUTF();
		System.out.println("���� ������ : " + newData);
		
		dos.close();
		out.close();
		sock.close();
		
	}
}

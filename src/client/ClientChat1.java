package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientChat1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 1234);
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		while(true) {
			System.out.print("1번 클라이언트 : ");
			String data = input.next();
			dos.writeUTF(data);
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String answer = dis.readUTF();
			String answer2 = dis.readUTF();
			String answer3 = dis.readUTF();
			System.out.println(answer);
			System.out.println(answer2);
			System.out.println(answer3);
		}
	}
}

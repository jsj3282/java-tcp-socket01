package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client07 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 123);
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		System.out.print("숫자 입력 : ");
		String data = input.next();
		dos.writeUTF(data);
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		String answer = dis.readUTF();
		
		boolean flag = true;
		while(flag) {
//			System.out.print("숫자 입력 : ");
//			String data = input.next();
//			dos.writeUTF(data);
//			InputStream in = sock.getInputStream();
//			DataInputStream dis = new DataInputStream(in);
//			String answer = dis.readUTF();
			System.out.println(answer);
			if(answer.equals("up")) {
				System.out.println(answer);
				System.out.print("다시 입력 : ");
				String data2 = input.next();
				dos.writeUTF(data2);
				answer = dis.readUTF();
			}else if(answer.equals("down")){
				System.out.println(answer);
				System.out.print("다시 입력 : ");
				String data3 = input.next();
				dos.writeUTF(data3);
				answer = dis.readUTF();
			}else {
				System.out.println(answer);
				System.out.println("성공!!");
				flag = false;
//				answer = dis.readUTF();
				dos.close();
				out.close();
				sock.close();
			}
		}
		
//		dos.close();
//		out.close();
//		sock.close();
	}
}

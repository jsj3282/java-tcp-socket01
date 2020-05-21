package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTime {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner input = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 12345);
		OutputStream out = sock.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		//System.out.print("문자열 입력 : ");
		String str = "시간을 주세요!";
		//str = input.nextLine();
		oos.writeObject(str);
		
		InputStream in = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		
		String readData;
		
		try {
			for (int i = 0; i < 10; i++) {
				readData = (String)ois.readObject();
				System.out.println(readData);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		oos.close();
		out.close();
		sock.close();
	}
}

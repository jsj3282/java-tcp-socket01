package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket server = new ServerSocket(12345);
		Socket sock = server.accept();
		
		File f = new File("C:\\12월취업반정선주\\aaa.txt");
		//FileInputStream fis = new FileInputStream(f);
		//BufferedInputStream bis = new BufferedInputStream(fis);
		InputStream in = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		
		Student st;
		st = (Student) ois.readObject();
		System.out.println(st.name);
		System.out.println(st.address);
		System.out.println(st.age);
		
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(st);
		oos.close();
	}
}

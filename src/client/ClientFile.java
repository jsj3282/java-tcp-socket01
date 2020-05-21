package client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import server.Student;


//class Student{
//	public String name;
//	public String address;
//	public String age;
//}

public class ClientFile {
	public static void main(String[] args) throws IOException {
		Socket sock = new Socket("127.0.0.1", 12345);
		Scanner input = new Scanner(System.in);
		Student st = new Student();
		OutputStream os = sock.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
			
		System.out.print("이름 : ");
		String name2 = input.nextLine();
		st.name = name2;
		
		System.out.print("주소 : ");
		String address2 = input.nextLine();
		st.address = address2;
	
		System.out.print("나이 : ");
		String age2 = input.nextLine();
		st.age = age2;
		oos.writeObject(st);
		
		oos.close();
		os.close();
		
	}
}

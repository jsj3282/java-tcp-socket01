package server;


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ServerTime {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		Socket sock = server.accept();
		
		//Date date;
		SimpleDateFormat simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");

		InputStream in = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);

		OutputStream out = sock.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		String readData;
		try {
			readData = (String)ois.readObject();
			System.out.println("수신 데이터 : " + readData);
			for (int i = 0; i < 10; i++) {
				Date date = new Date();
				//System.out.println("hello~~");
				String s = simpl.format(date);
				oos.writeObject(s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		in.close();
		sock.close();
	}
}

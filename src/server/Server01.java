package server;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);		//�������ϻ��� 0 ~ 65535
		System.out.println("������ ��ٸ��ϴ�!!!");
		Socket sock = server.accept();		//���Ӵ��
		Socket sock01 = server.accept();
		//���⼭ ������ Ŭ���̾�Ʈ�� ���� ����
		System.out.println("���� �Ǿ����ϴ�!!!");
		
		InetAddress inetaddr = sock.getInetAddress();
		System.out.println(inetaddr.getHostAddress());	//���� �����ߴ��� �˷���
		
		InputStream in = sock.getInputStream();		//������ ���� ����
		System.out.println("���� ������ ���� �����...");
		int readData = in.read();
		System.out.println("���� ������ : " + readData);
		
		
	}
}

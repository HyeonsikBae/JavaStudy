package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import thread.ClientThread;

public class mainClass {
	public static void main(String[] args) throws IOException {
		/*
			1. 접속해야 할 Server IP 설정
			2. Socket 생성
			3. 접속
			4. packet을 전송
		 */
													//127.0.0.1 < 자기자신		
		Socket socket = new Socket();
		
		try {
			
			InetSocketAddress socketAddr = new InetSocketAddress("192.168.7.68",9000);
			while(true) {
			socket.connect(socketAddr, 100);
			InetAddress inetAddr;
			if((inetAddr = socket.getInetAddress())!=null) {
				System.out.println("Server connect : " + inetAddr);
			}else {
				System.out.println("Server connect fail");
			}
			
			ClientThread thread = new ClientThread(socket);
			thread.start();
			
			while(true) {
			//동기화 필요
			//send
			Scanner scanner = new Scanner(System.in);
			System.out.println("입력 : ");
			String packetStr = scanner.nextLine();
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(packetStr);
			pw.flush();
			
			
			}
			//receive
			/*
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String packetStr2 = reader.readLine();
			System.out.println("서버로부터 패킷 : "+packetStr2);
			*/
			}
			//socket.close();

		}
			catch(IOException e) {
			e.getStackTrace();
		}
	}
}
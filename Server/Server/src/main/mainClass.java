package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class mainClass {
	public static void main(String[] args) {
		
		Socket client = new Socket();
		while(true) {
		try {
			ServerSocket server = new ServerSocket(8080);
			System.out.println("접속 대기 중");
			client = server.accept();
			
			System.out.println("IP : "+client.getInetAddress());
			System.out.println("Port : "+client.getPort());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String readStr = reader.readLine();
			System.out.println("Message : " + readStr);
			
			PrintWriter writer = new PrintWriter(client.getOutputStream());
			writer.println(readStr);
			writer.flush();
			
			client.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		}
}
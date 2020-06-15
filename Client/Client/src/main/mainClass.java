package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			Socket client = new Socket();
			int IP;
			IP = 55;
			IP++;
			if(IP==70) IP=55;
		InetSocketAddress socketAddr = new InetSocketAddress("192.168.7."+IP,9000);
		System.out.println("192.168.7."+IP);
		try {
			
			client.connect(socketAddr, 1000);
			InetAddress inetAddr;
			if((inetAddr = client.getInetAddress())!=null) {
				System.out.println("connect success");
			}
			else {
				System.out.println("connect fail");
			}
			//send
			//System.out.print("Message Input : ");
			//String message = scanner.next();
			String message = "ㅎㅇ";
			PrintWriter writer = new PrintWriter(client.getOutputStream());
			writer.println(message);
			writer.flush();

			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String messageReturn = reader.readLine();
			System.out.println("returnMessage : " + messageReturn);
			
			client.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
		}
	}
}
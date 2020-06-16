package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import thread.*;

public class main {

	public static void main(String[] args) {
		
		Socket socket = new Socket();
		
		try {
			ServerSocket serSocket = new ServerSocket(8070);
			
			while(true) {
				socket = serSocket.accept();	
				new ServerThread(socket).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
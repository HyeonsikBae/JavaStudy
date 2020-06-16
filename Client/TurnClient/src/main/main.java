package main;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import thread.*;
import gui.*;

public class main {

	static Socket socket = new Socket();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new GUI(socket);
		
		try {
			InetSocketAddress socketAddr = new InetSocketAddress("127.0.0.1",8070);
			while(true) {
				socket.connect(socketAddr, 9000);
				new ClientThread(socket).start ();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}		
	}
}
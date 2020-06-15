package thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread extends Thread {
	Socket socket;
	public ClientThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		super.run();
		try {
			while(true) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String packetStr2 = reader.readLine();
				System.out.println("서버로부터 패킷 : "+packetStr2);
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	
}

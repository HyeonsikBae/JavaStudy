package thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import gui.*;

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
				//System.out.println(GUI.textArea.getText());
				GUI.textArea.append(socket.getInetAddress()+ " : "+packetStr2+"\n");
				GUI.textArea.setCaretPosition(GUI.textArea.getDocument().getLength());
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
package thread;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
	
	Socket cliSocket;
	ArrayList<Socket> list;
	
	public ServerThread(Socket cliSocket, ArrayList<Socket> list) {
		this.cliSocket = cliSocket;//자기 자신의 소켓
		this.list = list;//소켓 묶음
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			while(true) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(cliSocket.getInputStream()));
				String packetStr = reader.readLine();
				System.out.println( cliSocket.getInetAddress()+" : "+packetStr);
				
				//send
				for(int i=0;i<list.size();i++) {
					Socket soc = list.get(i);
					if(cliSocket != soc) {
						PrintWriter pw = new PrintWriter(soc.getOutputStream());
						pw.println(packetStr);
						pw.flush();
					}
				}
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
}
package thread;

import java.io.BufferedReader;
import java.io.IOException;
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
			System.out.println("연결이 끊긴 IP : " + cliSocket.getInetAddress());
			list.remove(cliSocket);
			
			//남은 클라이언트 확인
			for(Socket s : list) {
				System.out.println("접속 중인 IP : "+s.getInetAddress()+"\n접속 중인 Port : "+s.getPort());
			}
			
			try {
				cliSocket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
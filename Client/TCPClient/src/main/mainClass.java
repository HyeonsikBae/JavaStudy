package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import gui.*;

import thread.ClientThread;

public class mainClass {
	
	static Socket socket = new Socket();
	private String ip = "";
	private int port = 0;
	
	

	public void write(String packetStr) throws IOException {
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.println(packetStr);
		pw.flush();
	}
	
	public static void main(String[] args) throws IOException {
		/*
			1. 접속해야 할 Server IP 설정
			2. Socket 생성
			3. 접속
			4. packet을 전송
		 */
													//127.0.0.1 < 자기자신

		new Login();
		
		try {
			System.out.println(this.ip);
			System.out.println(this.port+"0");
			InetSocketAddress socketAddr = new InetSocketAddress(ip,port);
			while(true) {
			socket.connect(socketAddr, 100);
			InetAddress inetAddr;
			if((inetAddr = socket.getInetAddress())!=null) {
				System.out.println("Server connect : " + inetAddr);
				GUI.textArea.append(inetAddr+" 접속 성공"+"\n");
			}else {
				System.out.println("Server connect fail");
				GUI.textArea.append("접속 실패");
			}
			
			ClientThread thread = new ClientThread(socket);
			thread.start();
			
			//동기화 필요
			//send

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
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
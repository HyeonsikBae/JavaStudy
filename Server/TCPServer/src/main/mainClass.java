package main;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.plaf.SliderUI;

import thread.ServerThread;

public class mainClass {
	public static void main(String[] args) {
		/*
			Server : TCP, DB(Oracle), Web(Tomcat)
			
			TCP : Transmission Control Protocol	//동기 통신
			UDP : User Datagram Protocol		//비동기 통신
			
			host : 종단 시스템.네트워크상 종단에 있는 기기.PC,스마트폰
			router : HW. host간 데이터를 교환할수 있게 하는 장비
			internet : 포괄적 통신			
			
			WWW : World Wide Web
			URL : Uniform Resource Locator
			
			TCP : send - receive. Data 경계(용량 한계)가 없다. 1:1 통신만 가능.
				   채팅, string, Object
			
			UDP : 비 연결형 .
				   편지, 지상파 방송
		  	      Data 경계가 있다.(용량 한계)
		  	      1:1 (unicast), 1:N (broadcast), N:N (multicast)
		  	      
		  	    7Layer
		  	      1. Physical		물리 계층
		  	      2. Data Link		IP를 헤더에 첨부
		  	      3. Network		IP 주소를 찾아감
		  	      4. Transport		Port 설정
		  	      5. Session		저장공간. 접속했던 정보 기억
		  	      6. Presentation	보안, 압축, 확장		
		  	      7. Application	프로그램		
		  	      
		  	Packet : 제어정보, 데이터들이 결합된 형태. 전송되는 실제 데이터
		  			 IP, Port, String, Object 등 포함
		  			 
		  	IP : Internet Protocol -> address (v4, v6)
		  	
		  	IP 는 PC 식별하기 위한 주소
		  	Port Number 는 Process를 식별하기 위한 번호 (0~1023 : sys용. 사용불가)
		  	
		  	Socket : 통신의 주체. 통신을 하기 위한 Object
		  			 IP, Port, 프로토콜(TCP/UDP 등)
		  	
		  	
		  	통신순서
		  		Server							Client
		  	1.	socket 버전 확인					1. Socket 버전 확인
		  	2.	Binding : IP, Port 설정
		  	3.	Listen 
		  	4.	Accept	<--------------------	2. Connect
		  	5.	receive, read					3. send, write
		  	6.	send							4. receive
		  	
		  	DNS Server ( Domain Name System Server) : IP -> String
		 */
		//서버는 accept 상태 유지하면서, stream 오는것도 확인..?해야해?
		/*
		 * TCP----------
			클라 -> 문지기 소켓 -> 담당자소켓 -> 서버
				한번 accept 되면, 통신은 성공. 담당자소켓정도 따로 저장해야함.
				새로운 클라 올 때마다 담당자소켓 생성.
				accept 상태 계속 유지하고 있어야 다음 클라이언트 받을 수 있다.
				
		 */
		
		Socket cliSocket = null;
		
		ArrayList<Socket> list = new ArrayList<Socket>();
		
								//192.168.7.61
		try {	
			ServerSocket serSocket = new ServerSocket(9000);// port number = 9000
			//Binding : IP, Port 설정
			
			//listen
			
			//client를 기다림
			while(true) {
			System.out.println("접속 대기중");
			cliSocket = serSocket.accept();//담당자 소켓이 클라 기다리는거.
										   //keep 해야 다른 클라 와도 답 가능.
			list.add(cliSocket);
			
			System.out.println("client IP : "+cliSocket.getInetAddress());
			System.out.println("client Port : "+cliSocket.getPort());
			
			new ServerThread(cliSocket, list).start();
			}
			//동기화 필요
			//receive
			/*
			BufferedReader reader = new BufferedReader(new InputStreamReader(cliSocket.getInputStream()));
			String packetStr = reader.readLine();
			System.out.println("클라로부터 패킷 : "+packetStr);
			//send
			PrintWriter pw = new PrintWriter(cliSocket.getOutputStream());
			pw.println(packetStr);
			pw.flush();
			}
			*/
			//cliSocket.close();
			//serSocket.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
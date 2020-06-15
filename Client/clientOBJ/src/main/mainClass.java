package main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

import DTO.MemberDTO;

public class mainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Socket socket = new Socket();
		InetSocketAddress socketAddr = new InetSocketAddress("127.0.0.1", 9000);
		
		socket.connect(socketAddr, 1000);
		
		InetAddress inetAddr;
		
		if((inetAddr = socket.getInetAddress())!=null) {
			System.out.println("connect success");
		}
		else {
			System.out.println("connect fail");
		}
		
		//send
		MemberDTO sendDto = new MemberDTO(25,"김밥");
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		oos.writeObject(sendDto);
		oos.flush();
		System.out.println("Cli부터 보낸 DTO : " + sendDto.toString());
		
		//receive
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		MemberDTO recvDTO = (MemberDTO)ois.readObject();
		System.out.println("Ser부터 받은 DTO : " + recvDTO.toString());
		
		/*
			 java.io.NotSerializableException
			 
			 이게 뭐냐
			 
			 직렬화 전송 -> 순서를 정해야 한다.
			 DTO 패키지에서 보자.
		 */
	}
}
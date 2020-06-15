package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import DTO.MemberDTO;

public class mainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
			Socket socket = new Socket();
			ServerSocket serSoc = new ServerSocket(9000);
			System.out.println("대기중..");
			socket = serSoc.accept();
			
			System.out.println("IP : "+socket.getInetAddress());
			System.out.println("Port : "+socket.getPort());
			
			//receive : inputStream
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Object obj = ois.readObject();
			//MemberDTO dto = (MemberDTO)ois.readObject();
			//System.out.println("Cli부터 받은 DTO : " + dto.toString());
			
			//send : outputStream
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			//oos.writeObject(dto);
			oos.writeObject(obj);
			oos.flush();
	}
}
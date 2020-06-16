package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import dto.*;
public class ServerThread extends java.lang.Thread {
	
	Socket socket;
	DTO dto;
	private static int play = 1;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while(true) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String message = reader.readLine();
				String[] str = message.split("-");
				dto = new DTO(str[0],Integer.parseInt(str[1]));
				PrintWriter writer;
				if(dto.number == play) {

					writer = new PrintWriter(socket.getOutputStream());
					writer.println(message);
					writer.flush();
					if(play==2)play=1;
					else play=2;
				}
				else {
					System.out.println("차례 지켜" + dto.getName() + "녀석아");
					writer = new PrintWriter(socket.getOutputStream());
					writer.println("차례 지켜 " + str[0]+"녀석아");
					writer.flush();
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
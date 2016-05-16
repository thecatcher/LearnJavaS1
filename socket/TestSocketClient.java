import java.io.*;
import java.net.*;

public class TestSocketClient{
	public static void main(String[] args){
			InputStream is =null;
	OutputStream os =null;
	try{
		Socket socket = new Socket("127.0.0.1",6666);
		is = socket.getInputStream();
		os = socket.getOutputStream();
		
		DataInputStream dis = new DataInputStream(is);
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeUTF("hey");
		String s = null;
		if((s=dis.readUTF())!=null){
			System.out.println(s);
		}
		dos.close();
		dis.close();
		socket.close();
	}catch(UnknownHostException e){
		e.printStackTrace();
	}catch(IOException e ){
		e.printStackTrace();
	}
	}
}
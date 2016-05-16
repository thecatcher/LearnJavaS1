 import java.net.*;
 import java.io.*;
 public class TCPserver{
	public static void main (String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(6666);
		while(true){
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			System.out.println("A client is accepted");
			s.close();
		}
	}
 }
 
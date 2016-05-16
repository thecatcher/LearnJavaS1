import java.io.*;
public class TestTransform1{
	public static void main(String[] Args){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt"));
			osw.write("this is a test for outputStreamWriter \r\n");
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt",true),"ISO8859_1");
			osw.write("this is test2");
			osw.close();
		}catch(IOException e){e.printStackTrace();}
	}
}
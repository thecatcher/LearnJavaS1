import java.io.*;
public class TestBufferStream{
	public static void main(String[] Args){
		try{
			FileInputStream fis = new FileInputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int c = 0;
			System.out.println((char)bis.read());
			System.out.println((char)bis.read());
			bis.mark(5);
			for(int i = 0 ;i<=10&&(c=bis.read())!=-1;i++){
				System.out.print((char)c+" ");
			}
			
			bis.reset();
			for(int i = 0;i<=10&&(c=bis.read())!=-1;i++){
				System.out.print((char)c+" ");
			}
			bis.close();
			
		}catch(IOException e){e.printStackTrace();}
	}
}

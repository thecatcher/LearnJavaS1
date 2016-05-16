import java.io.*;

public class TestFileStream{
	public static void main(String[] args){
//		output();
		input();
	}
	
	public static void output(){
		int b = 0;
		FileInputStream in = null;
		try{
			in = new FileInputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt");
		}catch(FileNotFoundException e){
			System.out.println("can not find the file");
			System.exit(-1);
		}
		
		try{
			long num = 0;
			while((b = in.read()) != -1){
				System.out.print((char)b);
				num++;
			} 
			in.close();
			System.out.println("total:"+num);
		}catch(IOException e){
			System.out.println("file IO error");
			System.exit(-1);
		}
	}
	
	public static void input(){
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt");
			out = new FileOutputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test2.txt");
			while((b = in.read())!= -1){
				out.write(b);
			}
			in.close();
			out.close();
		}catch(FileNotFoundException e1){
			System.out.println("can not find the file");
			System.exit(-1);
		}catch(IOException e2){
			System.out.println("can not copy the file");
			System.exit(-1);
		}
		System.out.println("file copyed");
	}
}
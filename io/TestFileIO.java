import java.io.*;
public class TestFileIO{
	static String path = "C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\";
	public static void main(String[] args){
//		testFileInputStream();
//		testFileOutputStream();
//		testFileReader();
//		testBufferStream();
//		testTransForm2();
//		testDataIO();
		testPrintString();
	}
	
	public static void testFileInputStream(){
		FileInputStream in = null;
		int b = 0;
		try{
			in = new FileInputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt");
		}catch(FileNotFoundException e){
			System.out.println("file Not Found!");
			e.printStackTrace();
			System.exit(-1);
		}
		long num =0;
		try{
			while((b = in.read())!= -1){
				System.out.print((char)b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("Total read: "+ num);
		}catch(IOException e){
			System.out.println("IO error!");
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public static void testFileOutputStream(){
		FileInputStream in = null;
		FileOutputStream out = null;
		int b = 0;
		try{
			in = new FileInputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt");
			out = new FileOutputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\testOutput.txt");
			while((b = in .read())!= -1){
				out.write(b);
			}
			in.close();
			out.close();
			System.out.println("file copyed");
		}catch(IOException e){
			System.out.println("IO error");
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public static void testFileReader(){
		FileReader fr = null;
		FileWriter fw = null;
		int b = 0;
		try{
			fr = new FileReader("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt");
			fw = new FileWriter("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\testForFileWriter.txt");
			while((b=fr.read())!= -1){
				System.out.print((char)b);
				fw.write(b);
			}
			fr.close();
			fw.close();
			System.out.println();
			System.out.println("file copyed");
		}catch(IOException e){
				System.out.println("IO error");
				e.printStackTrace();
				System.exit(-1);
		}
	}

	public static void testBufferStream(){
		try{
			FileInputStream fis = new FileInputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int c = 0;
			System.out.println((char)bis.read());
			System.out.println((char)bis.read());
			bis.mark(20);
			System.out.println((char)bis.read());
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void testTransForm(){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\brady\\Documents\\001.coding\\001.java\\javaCode\\io\\test.txt"));
			for(int i=0;i<10;i++){
				osw.write("this is a test for OutputStreamWriter "+i+"\r\n");
				
			}
			osw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void testTransForm2(){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bis = new BufferedReader(isr);
			String s = null;
			s = bis.readLine();
			while(s!=null){
				if(s.equalsIgnoreCase("exit")){
					break;
				}
				System.out.println(s.toUpperCase());
				s = bis.readLine();
			}
			bis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void testDataIO(){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			System.out.println(bais.available());
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			dos.close();
			dis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void testPrintString(){
		PrintStream ps = null;
		try{
			FileOutputStream fos = new FileOutputStream(path+"testPrintString.txt");
			ps = new PrintStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		if(ps!= null){
			System.setOut(ps);
		}
		int ln = 0;
		for(char c = 0;c<60000;c++){
			System.out.print(c+" ");
			if(ln++>100){System.out.println();ln = 0;}
		}
	}
	
	public static void testPrintString()
}
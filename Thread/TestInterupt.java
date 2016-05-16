import java.util.*;
public class TestInterupt{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		mt.start();
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			
		}
//		mt.interrupt();
		mt.stopThread();
	
	}
}

class MyThread extends Thread{
	private boolean flag = true;
	public void run(){
		while(flag){
			System.out.println("======"+new Date()+"======");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("eeee");
				return;
			}
		}
	}
	public void stopThread(){
		this.flag = false;
	}
}
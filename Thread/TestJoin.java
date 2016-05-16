public class TestJoin{
	public static void main(String[] args){
		MyThread2 mt2 = new MyThread2("mt2");
		mt2.start();
		for(int i=0;i<5;i++){
			System.out.println("I am main");
		}
		try{
			mt2.join();
		}catch(InterruptedException e){
			
		}
		for(int i=0;i<5;i++){
			System.out.println("I am main");
		}
	}
}

class MyThread2 extends Thread{
	MyThread2(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("i am "+this.getName());
			try{
				sleep(1000);
			}catch(InterruptedException e){
				return;
			}
		}
	}
}
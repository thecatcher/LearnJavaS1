public class TestYield{
	public static void main(String[] args){
		MyThread3 t1 = new MyThread3("t1");
		MyThread3 t2 = new MyThread3("t2");
		t1.start();
		t2.start();
	}
}

class MyThread3 extends Thread{
	MyThread3(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<20;i++){
		System.out.println("i am "+this.getName()+" "+i);
		if(i%5==0){
			Thread.yield();
		}
		}
	}
}
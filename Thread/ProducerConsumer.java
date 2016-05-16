public class ProducerConsumer{
	public static void main(String[] args){
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		
		 new Thread(p).start();
		 new Thread(c).start();
//		tp.start();
//		tc.start();
	}
}

class WoTou{
	int id;
	WoTou(int id){
		this.id = id;
	}
	public String toString(){
		return "WoTou: "+id;
	}
}

class SyncStack{
	int index = 0;
	WoTou[] arrWT = new WoTou[6];
	
	public synchronized void push(WoTou wt){
		if(index==arrWT.length){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		arrWT[index] = wt;
		index++;
		this.notify();
		
	}
	
	public synchronized WoTou pop(){
		if(index == 0){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return arrWT[index];
		
	}
}

class Producer implements Runnable{
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	public void run(){
		for(int i = 0;i<20;i++){
			WoTou wt = new WoTou(i);
			System.out.println("produce: "+wt);
			ss.push(wt);
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss = ss;
	}
	public void run(){
		for(int i = 0;i<20;i++){
			WoTou wt = ss.pop();
			System.out.println("eat: "+wt);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
//public class Fib{
//	public static void main(String[] args){
//			for(int i =1;i<10;i++){
//				System.out.println(fib(i));
//			}
//	}
//	public static int fib(int n){
//		if(n==1||n==2)
//			return 1;
//		else{
//			return fib(n-1)+fib(n-2);
//		}
//	}
//}

public class Fib{
	public static void main(String[] args){
		for(int i =1;i<6;i++){
			System.out.print(fib(i));
		}
	}
	public static int fib(int n){
		int a,b,c;
		a=0;
		b=1;
		c=0;
		for(int i=0;i<n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
}
//import java.util.*;
public class GenericTest{
	public static void main(String[] agrs){
		Box<String> name = new Box<String>("tim");
		System.out.println(name.getData());
	}
}
class Box<T>{
	private T data;
	
	Box(){
		
	}
	
	Box(T data){
		this.data = data;
	}
	public T getData(){
		return this.data;
	}
}

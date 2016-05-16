public class overLoadTest{
//		
//	public void foo1(String name,int age){
//		System.out.println("My name is "+name+"and I am "+age+"years old");
//	}
//	public void foo1(String name){
//		System.out.println("My name is "+name);
//	}
//	public static void main(String[] args){
//		overLoadTest p = new overLoadTest();
//		p.foo1("tim",29);
//		p.foo1("tim");
//	}
}

public class Person{
	private String name;
	private int id;
	Person(){
		this.name ="JIM";
		this.id = 20;
	}
	Person(String _name){
		this.name = _name;
		this.id=20;
	}
	Person(String _name,int _id){
		this.name = _name;
		this.id = _id;
	}
	
	public void info(){
		System.out.println
	}
}
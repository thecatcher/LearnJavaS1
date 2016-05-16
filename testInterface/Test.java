interface Singer{
	public void sing();
	public void sleep();
}

class Student implements Singer{
	private String name;
	Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println("studying");
	}
	public String getName(){
		return this.name;
	}
	public void sing(){
		System.out.println("student is singing");
	}
	public void sleep(){
		System.out.println("student is sleeping");
	}
}

public class Test{
	public static void main(String[] args){
		Student s1 = new Student("Tim");
		System.out.println(s1.getName());
		s1.sing();
		s1.sleep();
	}
}
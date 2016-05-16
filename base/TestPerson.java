class Person{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}
class Student extends Person{
	private String school;
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return this.school;
	}	
}
public class TestPerson{
	public static void main(String[] args){
		Student stu1 = new Student();
		stu1.setName("Tim");
		stu1.setAge(21);
		stu1.setSchool("SCH");
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		System.out.println(stu1.getSchool());
	}
}

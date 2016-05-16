class Person{
	private String name;
	private String location;
	
	Person(String name){
		this.name = name;
		this.location ="beijing";
	}
	Person(String name,String location){
		this.name = name;
		this.location = location;
	}
	public String info(){
		return "name: "+name+"location:"+location;
	}
}

class Student extends Person{
	private String school;
	Student(String name,String school){
		this(name,"beijing",school);
	}
	Student(String n,String l,String school){
		super(n,l);
		this.school = school;
	}
	public String info(){
		return super.info() + "school: "+school;
	}
}

 class Test2{
	public static void main(String[] args){
		Person p1 = new Person("P1");
		Person p2 = new Person("p2","shanghai");
		
		Student s1 = new Student("S1","university");
		Student s2 = new Student("S2","beijing","cool");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}
}
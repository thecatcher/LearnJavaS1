public class Person{
	private String name;
	private int age =20;
	Person(String _name){
		this.name = _name;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public static void main(String[] args){
		Person tom = new Person("tom");
		System.out.println(tom.name);
	}
}

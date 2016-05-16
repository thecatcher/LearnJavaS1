class Animal{
	public String name;
	Animal(String name){
		this.name = name;
	}
}
class Cat extends Animal{
	public String eyeColor;
	Cat(String n,String c){
		super(n);
		this.eyeColor = c;
	}
}
class Dog extends Animal{
	public String furColor;
	Dog(String n,String f){
		super(n);
		this.furColor = f;
	}
}

public class Test{
	public static void main(String[] args){
		Animal a = new Animal("name");
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","black");
		
//		System.out.println(a instanceof Animal); //true
//		System.out.println(c instanceof Animal); //true
//		System.out.println(d instanceof Animal); //true
//		System.out.println(a instanceof Cat);//false
//		
//		a = new Dog("bigYellow","yellow");
//		System.out.println(a instanceof Animal);
//		System.out.println(a instanceof Dog);
//		System.out.println(a.name);
//		System.out.println(a.furColor);
//		Dog d1 = (Dog)a;
//		System.out.println(d1.furColor);
		Test test = new Test();
		test.f(a);
		test.f(c);
		test.f(d);
	
	}
	public static void f(Animal a){
		System.out.println("name :"+a.name);
		if(a instanceof Cat){
			Cat cat = (Cat)a;
			System.out.println(" "+cat.eyeColor+" eyes");
		}else if (a instanceof Dog){
			Dog dog = (Dog)a;
			System.out.println(" "+dog.furColor+" fur");
		}
	}
}
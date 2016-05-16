abstract class Animal{
	private String name;
	Animal(String name){
		this.name = name;
	}
	abstract public void enjoy();
}
class Cat extends Animal{
	private String eyeColor;
	Cat(String name,String eyeColor){
		super(name);
		this.eyeColor = eyeColor;
	}
	public void enjoy(){
		System.out.println("miao~~~");
	}
}
class Dog extends Animal{
	private String furColor;
	Dog(String name,String furColor){
		super(name);
		this.furColor = furColor;
	}
	public void enjoy(){
		System.out.println("wang~~~");
	}
}

class Lady{
	private String name;
	private Animal pet;
	Lady(String name,Animal pet){
		this.name = name;
		this.pet = pet;
	}
	public void enjoyPet(){
		pet.enjoy();
	}
}

public class Test{
	public static void main(String[] args){
		Cat c1 = new Cat("catName","blue");
		Dog d1 = new Dog("dogNmae","black");
		Lady l1 = new Lady("LiLi",c1);
		Lady l2 = new Lady("July",d1);
		
		l1.enjoyPet();
		l2.enjoyPet();
	}
}
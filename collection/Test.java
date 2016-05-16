import java.util.*;
public class Test{
	public static void main(String[] agrs){
		Collection c = new HashSet();
		c.add(new Name("f1","l1"));
		c.add(new Name("f221","l1"));
		c.add(new Name("f221","l1"));
		c.add(new Name("f1111","l1"));
		
		Iterator i = c.iterator();
		while(i.hasNext()){
			Name name = (Name)i.next();
			System.out.println(name.getFirstName()+" . "+name.getLastName());
		}
		for(Iterator i2 = c.iterator();i2.hasNext();){
			Name name = (Name)i2.next();
			if(name.getFirstName().length()<3){
				i2.remove();
			}
		}
		i = c.iterator();
		while(i.hasNext()){
			Name name = (Name)i.next();
			System.out.println(name.getFirstName()+" . "+name.getLastName());
		}
	}
}

class Name{
	private String firstName;
	private String lastName;
	
	Name(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public boolean equals(Object obj){
		if(obj instanceof Name){
			Name name = (Name)obj;
			return(this.firstName.equals(name.firstName)&&this.lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	public int hashCode(){
		return this.firstName.hashCode();
	}
}
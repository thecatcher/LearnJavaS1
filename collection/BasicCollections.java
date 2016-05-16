import java.util.*;
public class BasicCollections{
	public static void main(String[] args){
/*		
		Collection c = new HashSet();
		c.add("hello");
		c.add(new Name("f1","l1"));
		c.add(new Integer(111));
		System.out.println(c);
		c.remove("hello");
		c.remove(new Integer(111));
		System.out.println(c.remove(new Name("f1","l1")));
		System.out.println(c);
*/
		Collection c = new HashSet();
		c.add(new Name("f1","l1"));
		c.add(new Name("f2222","l2"));
		c.add(new Name("f3","l3"));
		

		for(Iterator i = c.iterator();i.hasNext();){
			Name name = (Name)i.next();
			if(name.getFirstName().length()<3){
				i.remove();
			}
		}
		Iterator i = c.iterator();
		while(i.hasNext()){
			Name n = (Name)i.next();
			System.out.println(n.getFirstName());
		}
	}
}
class Name{
	private String firstName;
	private String lastName;
	Name(String firstName ,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String lastName(){
		return this.lastName;
	}
	public String toString(){
		return firstName+" "+lastName;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Name){
			Name name = (Name) obj;
			return(this.firstName.equals(name.firstName)&&this.lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	public int hashCode(){
		return this.firstName.hashCode();
	}
}
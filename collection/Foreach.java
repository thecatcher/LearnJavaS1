import java.util.*;
public class Foreach{
	public static void main(String[] args){
		Collection c = new HashSet();
		c.add(new String("111"));
		c.add(new String("121"));
		c.add(new String("221"));
		for(Object eachItem:c){
			System.out.println(eachItem);
		}
		
		
	}
}
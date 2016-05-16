public class TestString{
	public static void main(String[] args){
		//testConstractor();
		//testMethod();
		//testGetChars();
		//compareString();
		//testRegionMatches();
		testWith();
	}
	public static void testConstractor(){
		String str1 = new String();
		String str2 = "this is a test";
		String str3 = new String("this is a test 2");
		char[] charArray = new char[]{'a','b','c','d','e','f','g','h'};
		String str4 = new String(charArray,2,3);
		String str5 = new String(str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
	public static void testMethod(){
		String testString = "hey,this is a test String";
		String testStringNull = new String();
		System.out.println("the length of testString is "+testString.length());
		System.out.println(testString.isEmpty());
		System.out.println(testStringNull.isEmpty());
		System.out.println(testString.charAt(2));
	}
	public static void testGetChars(){
		String testStr = "abcdefghi";
		char[] charArray = new char[]{'1','2','3','4','5'};
		testStr.getChars(2,4,charArray,2);
		System.out.println(charArray);
	//	String dst ="12345";
	//	testStr.getChars(2,4,dst,2);
	//	System.out.println(dst);
	}
	public static void compareString(){
		String strA = "abcd";
		String strB = "abcde";
		System.out.println(strA.compareTo(strB));
	}
	public static void testRegionMatches(){
		String testString = "21aBcdefghi";
		System.out.println(testString.regionMatches(-1,"1abcdesf",0,5));//false
		System.out.println(testString.regionMatches(1,"1abcdesf",0,5));//false
		System.out.println(testString.regionMatches(true,1,"1abcdesf",0,5));//true
	}
	public static void testWith(){
		String testStr = "abcdefgh";
		System.out.println(testStr.startsWith("bcd",1));
		System.out.println(testStr.startsWith("abcd"));
		System.out.println(testStr.endsWith("gh"));
	}
}

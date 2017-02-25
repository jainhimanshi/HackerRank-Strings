//ques 12 -ques 31.
package w3stringsolutions;
public class Remainingques {
	public static void main(String[] args) {
	String s1="JAIN";
	String s2="  HIMANSHI JAIN ";
	System.out.println(s1.endsWith(s2));
	//concatenation.
	System.out.println(s1.concat(s2));
	//Java program to check whether two String objects contain the same data
	System.out.println(s1.equals(s2));
	//Java program to get the contents of a given string as a byte array
	System.out.println(s1.getBytes());
	// Java program to get the contents of a given string as a character array
	System.out.println(" array"+s1.getChars(0,1,s1,3));
		//Java program to trim any leading or trailing whitespace from a given string
	System.out.println(s2.trim());
}

}

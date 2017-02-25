//Java program to create a new String object with the contents of a character array.
package w3stringsolutions;

public class Stringobjectwithchararray {

	public static void main(String[] args) {
		char array[]={'A','B','C'};
		String s=String.copyValueOf(array,0,3);
		System.out.println(s);
		
		
	}

}

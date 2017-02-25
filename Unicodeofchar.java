//Write a Java program to get the character (Unicode code point) at the given index within the String. 
package w3stringsolutions;
import java.util.Scanner;
public class Unicodeofchar {
	public static void main(String[] args) {
		String name="HIMANSHI";
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(name.codePointAt(n));
	}

}

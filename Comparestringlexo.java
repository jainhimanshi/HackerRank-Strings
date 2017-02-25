// java program to compare two strings lexicographically
package w3stringsolutions;
public class Comparestringlexo {
	      public static void main(String[] args) {
	    	  //case1=when both same.only length differ
		 String s1="HIMANSHI";
		 String s2="HIMANSHIJAIN";
		 System.out.println(s1.compareTo(s2));
		 //When char are different, we get difference of ASCII value of first no. which is different.
		 String s3="HIMANSHI";
		 String s4="HH";
		 System.out.println(s3.compareTo(s4));
	}

}

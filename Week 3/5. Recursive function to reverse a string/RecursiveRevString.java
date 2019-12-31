import java.util.Scanner;

public class RecursiveRevString {
	
	public static void reverseString(String userString) {
		if ((userString==null)||(userString.length() <= 1)) 
	           System.out.println(userString); 
	        else
	        { 
	            System.out.print(userString.charAt(userString.length()-1)); 
	            reverseString(userString.substring(0,userString.length()-1)); 
	        } 
	}
	public static void main(String[] args) {
		Scanner userString = new Scanner(System.in);  
	    System.out.println("Please provide a sentence to reverse:");
	    String stringToReverse = userString.nextLine(); 
	    reverseString(stringToReverse);
	}

}

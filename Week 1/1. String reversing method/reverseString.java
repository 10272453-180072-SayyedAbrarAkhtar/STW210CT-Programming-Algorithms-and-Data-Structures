import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String sentence) {
		String reverseSentence = "";
		String temp;
		// using length() method to get length of the string
		if(sentence.length() == 1) {
			return "EXCEPTION: Either you have provided only one letter or white space to reverse!!";
		}
		else {
			for(int  i= sentence.length()-1; i>=0;i--) {
			temp = Character.toString(sentence.charAt(i)); //using charAt() method to get the character at given index
			reverseSentence = reverseSentence + temp;
			
		}
		return reverseSentence;
		}
		
	}

	public static void displayResult(String sentenceToReverse) {
		
		System.out.println("\nThis is a original string:==>   " + sentenceToReverse);
		System.out.println("-------------------------------------------------------------------------------------------------------------->");
		System.out.println("This is a reverse of the string:==>   " + reverseString(sentenceToReverse));
		System.out.println("===============================================================================================================\n");	
		
	}

	public static void main(String[] args) {
		Scanner userSentence = new Scanner(System.in);  
	    System.out.println("Please provide a sentence to reverse:");
	    String sentenceToReverse = userSentence.nextLine(); 
		displayResult(sentenceToReverse);
	}

}

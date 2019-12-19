
public class reverseString {
	
	public static String reverseString(String sentence) {
		char[] sentenceChar = sentence.toCharArray();
		String reverseSentence = "";
		String temp;

		if(sentenceChar.length == 1 && sentence != " ") {
			return "EXCEPTION: You have provided only one letter to reverse!!";
		}
		else if(sentence == " ") {
			return "EXCEPTION: You have provided white space to reverse!!";
		}
		else {
			for(int  i= sentenceChar.length-1; i>=0;i--) {
			temp = Character.toString(sentenceChar[i]);
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
		// TODO Auto-generated method stub
		displayResult("a");
		displayResult(" ");
		displayResult("Hello! this is a program that reverse the string!");
		
	}

}

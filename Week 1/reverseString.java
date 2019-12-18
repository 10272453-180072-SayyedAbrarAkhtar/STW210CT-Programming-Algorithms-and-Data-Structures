
public class reverseString {
	
	public static String reverseString(String sentence) {
		char[] sentenceChar = sentence.toCharArray();
		String reverseSentence = "";
		String temp;
		for(int  i= sentenceChar.length-1; i>=0;i--) {
			temp = Character.toString(sentenceChar[i]);
			reverseSentence = reverseSentence + temp;
			
		}
		return reverseSentence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userString = "Hello! This a program build to reverse a string!!!";
		System.out.println("This is a original string:==>   " + userString);
		System.out.println("------------------------------->");
		System.out.println("This is a reverse of the string:==>   " + reverseString(userString));
		
	}

}

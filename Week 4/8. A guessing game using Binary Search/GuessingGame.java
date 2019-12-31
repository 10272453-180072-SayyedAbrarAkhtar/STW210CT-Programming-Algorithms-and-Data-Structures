import java.util.Scanner;

public class GuessingGame {
	
	
	static int num[] = new int[20000];
	static boolean isThis = false;
	static boolean isLarger = false;
	static boolean isSmaller = false;
	static Scanner feedback = new Scanner(System.in);
	
	public static void createNum() {
		for (int i=0; i<20000; i++) {
			num[i] = i+1;
		}
	}
	public static void retrieveNums() {
		for(int i=0; i<20000; i++) {
			System.out.print(num[i]+" ");
		}
		
	}
	public static void questionAndFeedback(int result) {
		int temp1 = 0, temp2 = 0;
		
		if(isLarger) {
			temp1=result;
			if (temp1==temp2){
				return;
			}
			System.out.println("Is your number larger than " + num[result] + " ?");
			 String replyLargest = feedback.nextLine(); 
			 if(replyLargest=="y") {
				 
				 isSmaller=false;
				 isLarger=true;
				 return;
			 }
		}
		if(isSmaller) {
			temp2=result;
			if (temp1==temp2){
				return;
			}
			System.out.println("Is your number smaller than " + num[result] + " ?");
			 String replySmaller = feedback.nextLine(); 
			 if(replySmaller=="y") {
				 
				 isLarger=false;
				 isSmaller=true;
				 return;
			 }
		}
	}
	public static void guessingGame(int arr[], int searchNum, int firstIndex, int lastIndex) {
		int midIndex = (firstIndex + lastIndex)/2;
		if(searchNum == arr[midIndex]) {
			System.out.println("Your Number is: " + num[midIndex]);
			return;
		}
		
		
		if(searchNum < arr[midIndex]) {
			isSmaller=true;
			questionAndFeedback(midIndex);
			lastIndex=midIndex-1;
			guessingGame(num, searchNum, firstIndex, lastIndex);
			return;
		} 
		
		if(searchNum > arr[midIndex]) {
			isLarger=true;
			questionAndFeedback(midIndex);
			firstIndex= midIndex+1;
			guessingGame(num, searchNum, firstIndex, lastIndex);
			return;
		} 
		
	}
	public static void main(String[] args) {
		createNum();
		Scanner feedback = new Scanner(System.in);
		System.out.println("Think of any number between 1 and 20000 and I will guess for it. :) ");
		int searchNum = feedback.nextInt();
		System.out.println("\n\nPlease reply in (y/n) format!!!\n\n");
		guessingGame(num, searchNum, 0, num.length-1);
	
	}

}

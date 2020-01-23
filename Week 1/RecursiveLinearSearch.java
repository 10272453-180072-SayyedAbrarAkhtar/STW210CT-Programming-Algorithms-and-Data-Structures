import java.util.Scanner;

public class RecursiveLinearSearch {
	
	static int arrNum[] = {12, 8, 1, 9, 5, 89, 4, 2};
	
	public static int arrIndexSearch(int[] arrInt, int firstIndex, int lastIndex, int searchItem) {
		if (lastIndex < firstIndex) 
            return -1; 
         if (arrInt[firstIndex] == searchItem) 
            return firstIndex; 
         if (arrInt[lastIndex] == searchItem) 
            return lastIndex; 
         return arrIndexSearch(arrInt, firstIndex+1, lastIndex-1, searchItem);
	}
	
	public static void linearSearch(int searchNum ) {
		int index = arrIndexSearch(arrNum, 0, arrNum.length-1, searchNum);
		if (index!=-1) {
			System.out.println("Searched number "+ searchNum + " is present at index of ----> " + index );
		} else {
			System.out.println("Sorry!! Searched number is not present. :(");
		}
	}

	public static void main(String[] args) {
		Scanner searchItem = new Scanner(System.in);
		System.out.println("Please enter number to search:");
		int numToSearch = searchItem.nextInt();
		linearSearch(numToSearch);
	}

}



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

	public static void timeComplexity() {
		System.out.println("\n\n<============================================================================>");
		System.out.println("<============================Time Complexity=================================>\n");
		System.out.println("Best Case: O(1) \nIn this case item is found out in first attempt");
		System.out.println("Worst Case: O(n) \nIn this case item is found out in nth attempt of searching \nwhere n is the total number of items in the array.");
	}

	public static void main(String[] args) {
		Scanner searchItem = new Scanner(System.in);
		System.out.println("Please enter number to search:");
		int numToSearch = searchItem.nextInt();
		linearSearch(numToSearch);
		timeComplexity();
		
	}

}		
//The best case Time Complexity in a Linear search is O(1) where we find the search Item in first attempt
//The worst case Time complexity in a Linear search is O(n) where we continue searching each item and find the search item at last.
  

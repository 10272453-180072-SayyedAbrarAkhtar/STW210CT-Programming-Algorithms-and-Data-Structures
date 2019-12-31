import java.util.Scanner;


public class BinarySearch {
	static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	
	public static int findSearchIndex(int arr[], int searchNum, int firstIndex, int lastIndex) {
		if (lastIndex>=firstIndex) {
			int midIndex = (firstIndex+lastIndex)/2;
			if(searchNum==primes[midIndex]) {
				return midIndex;
			}
			if(searchNum>primes[midIndex]) {
				firstIndex=midIndex+1;
				return findSearchIndex(primes, searchNum, firstIndex, lastIndex);
			}
			lastIndex=midIndex-1;
			return findSearchIndex(primes, searchNum, firstIndex, lastIndex);
		}
		return -1;
	}
	
	public static void searchResult(int searchNum) {
		int itemIndex = findSearchIndex(primes, searchNum, 0, primes.length-1);
		if (itemIndex < 0 ) {
			System.out.println("Sorry!!! Searched number is not present. :(");
			return;
		}
		System.out.println("The Searched number: " + searchNum + " is present at Index: " + itemIndex );
	}

	public static void main(String[] args) {
		System.out.println("The list of some Prime numbers are: \n2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97");
		Scanner searchItem = new Scanner(System.in);
		System.out.println("Please enter number to search:");
		int numToSearch = searchItem.nextInt();
		searchResult(numToSearch);
	}

}

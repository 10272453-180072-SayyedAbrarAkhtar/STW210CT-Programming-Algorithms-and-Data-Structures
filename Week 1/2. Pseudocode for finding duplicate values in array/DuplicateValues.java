
public class DuplicateValues {
	
	
	public static void duplicateValues(int[] valuesArray) {
		

		if (valuesArray.length == 1) {
			System.out.println("There cant be duplicate as the array has only one element!!");
		}
		
		for(int i = 0; i < valuesArray.length-1; i++) {
			for(int j = i+1; j < valuesArray.length; j++) {
				if((valuesArray[j] == valuesArray[i]) && (i != j)) {
					System.out.println(valuesArray[j]);
				}
			}
		}
	}
	
	public static void displayResult(int[] valuesArray) {
		System.out.println("The duplicate values in Array are: ");
		duplicateValues(valuesArray);
		System.out.println("<============================================>");
	}

	public static void main(String[] args) {
		int arrayValue[]= {1,2,2,6,5,4,3,4,5};
		displayResult(arrayValue);
		int arrayValue2[]= {0};
		displayResult(arrayValue2);
		int arrayValue3[]= {2,2,5,5};
		displayResult(arrayValue3);
	}

}

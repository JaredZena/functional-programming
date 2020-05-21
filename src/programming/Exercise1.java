package programming;

import java.util.Arrays;

public class Exercise1 {

	public static void main(String[] args) {
		int[] numbers = {12,9,13,4,6,2,4,12,15};
		printAllOddNumbers(numbers);
	}
	
	
	
	public static void printAllOddNumbers(int[] numbers) {
		System.out.println("Printing all odd numbers in the list: ");
		Arrays.stream(numbers)
			.sorted();
		
		
	}
	
	

}

package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
		printSumOfAllNumbers(numbers);

	}
	
	private static void printSumOfAllNumbers(List<Integer> numbers) {
		System.out.println("Printing the sum of all numbers in list: ");
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		System.out.println(sum);
	}

}

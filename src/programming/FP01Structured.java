package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
		printAllNumbersInListStructured(numbers);
		printAllEvenNumbersInListStructured(numbers);

	}
	
	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
		System.out.println("Printing all even numbers in list: ");
		for(int number:numbers) {
			if (number%2==0) {
				System.out.println(number);
			}
		}
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		System.out.println("Printing all numbers in list: ");
		// How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number);
		}
		
	}

}

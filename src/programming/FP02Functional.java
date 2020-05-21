package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
		printSumOfAllNumbers(numbers);
		printHighestNumber(numbers);
		printLowestNumber(numbers);
	}
	
	private static void printSumOfAllNumbers(List<Integer> numbers) {
		System.out.println("Printing the sum of all numbers: ");
		int sum = numbers.stream()
		.reduce(0, (x,y) -> x+y);
		System.out.println(sum);
	}
	
	private static void printHighestNumber(List<Integer> numbers) {
		System.out.println("Printing the highest of all numbers: ");
		int highest = numbers.stream()
		.reduce(Integer.MIN_VALUE, (x,y) -> x>y?x:y);
		System.out.println(highest);
	}
	
	private static void printLowestNumber(List<Integer> numbers) {
		System.out.println("Printing the lowest of all numbers: ");
		int lowest = numbers.stream()
		.reduce(Integer.MAX_VALUE, (x,y) -> x<y?x:y);
		System.out.println(lowest);
	}
}

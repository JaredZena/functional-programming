package programming;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Spring", "Spring Boot", 
				"API", "Microservices", "AWS", "PCF", 
				"Azure", "Docker", "Kubernetes");
		
		printAllCourses(courses);
		printAllCoursesOrdered(courses);
		printAllCoursesWithSpring(courses);
		printAllCoursesWithFourLetters(courses);
		printNumberOfCharactersInCourseNames(courses);
		printCoursesAtLeast4Letters(courses);
	}
	
	public static void printCoursesAtLeast4Letters(List<String> courses) {
		System.out.println("Printing all courses whose name has at least 4 letters: ");
		courses.stream()
			.filter(course -> course.length()>4)
			.forEach(System.out::println);
	}
	
	public static void printAllCourses(List<String> courses) {
		System.out.println("Printing all courses individually: ");
		courses.stream()
			.forEach(System.out::println);
	}

	public static void printAllCoursesOrdered(List<String> courses) {
		System.out.println("\nPrinting all courses ordered: ");
		courses.stream()
			.sorted()
			.forEach(System.out::println);
	}
	
	public static void printAllCoursesWithSpring(List<String> courses) {
		System.out.println("\nPrinting all courses that contain the word String: ");
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.sorted()
			.forEach(System.out::println);
	} 
	
	public static void printAllCoursesWithFourLetters(List<String> courses) {
		System.out.println("\nPrinting all courses with 4 letters or more: ");
		courses.stream()
			.filter(course -> course.length()>=4)
			.sorted()
			.forEach(System.out::println);
	}
	
	public static void printNumberOfCharactersInCourseNames(List<String> courses) {
		System.out.println("\nPrinting the number of characters in each course name: ");
		courses.stream()
			.sorted()
			.map(course -> course + " " + course.length())
			.forEach(System.out::println);
	}
}

package programming;


import java.time.LocalTime;

public class FP01Functional {

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
//		printAllNumbersInListFunctional(numbers);
//		printAllEvenNumbersInListFunctional(numbers);
//		printSquaresOfEvenNumbersInListFunctional(numbers);
//		printCubesOfOddNumbers(numbers);
		
//		System.out.println(10+5-(10%5));
		
//		sumHours();
//		makeArray();
		
		String[][] m1 = {{"09:00","10:00"},{"12:00","13:00"},{"16:00","18:00"}};
		String[] r1 = {"09:00","18:30"};
		String[][] m2 = {{"10:00","11:30"},{"12:30","14:30"},{"14:30","15:00"},{"16:00","17:00"}};
		String[] r2 = {"10:00","20:00"};
		int mL = 30;
		// Sample output [['11:30','12:00'],['15:00','16:00'],['18:00','18:30']]
		
		findTime(m1,m2,r1,r2,mL);
	}
	
	private static void findTime(String[][] m1, 
			String[][] m2,
			String[] r1,
			String[] r2,
			int mL) {
		String[] rangoFinal = {"",""};
		if (LocalTime.parse(r1[0]).isAfter(LocalTime.parse(r2[0]))) {
			rangoFinal[0] = r1[0];
		} else {
			rangoFinal[0] = r2[0];
		}
		
		if (LocalTime.parse(r1[1]).isBefore(LocalTime.parse(r2[1]))) {
			rangoFinal[1] = r1[1];
		} else {
			rangoFinal[1] = r2[1];
		}
		
		System.out.println(rangoFinal[0] + " " + rangoFinal[1]);
		
		 for (int i = 0; i<m1.length;i++) {
			 
		 }
		
	}
	
	// private static Date convertTime(String hora) {
	// 	 SimpleDateFormat df = new SimpleDateFormat("HH:mm");
	// 	 try {
	// 		Date t = df.parse(hora);
	// 		return t;
	// 	} catch (ParseException e) {
	// 		e.printStackTrace();
	// 	}
	// 	return null;
	// }
	
	// private static void makeArray() {
	// 	int[] first = {2,5,3,8,5};
	// 	int[] second = {6,1,5,8,7};
		
	// 	Set<Integer> settin = new HashSet<>();
		
	// 	for (int x : first) {
	// 		settin.add(x);
	// 	}
		
	// 	for (int y : second) {
	// 		settin.add(y);
	// 	}
		
	// 	System.out.println(settin);
		
	// }
	
	// /**
	//  * 
	//  */
	// private static void sumHours() {
	// 	Map<String,Integer> modules = new HashMap<String, Integer>();
	// 	modules.put("Project design",15);
	// 	modules.put("Inicio de sesion/Autenticacion",20);
	// 	modules.put("Roles de usuario", 15);
	// 	modules.put("Menu principal y buscador", 15);
	// 	modules.put("Vehiculos", 15);
	// 	modules.put("Inventario de herramientas",10);
	// 	modules.put("Recursos humanos", 12);
	// 	modules.put("Materias primas", 15);
	// 	modules.put("Proyectos", 30);
	// 	modules.put("Contabilidad", 20);
	// 	modules.put("Proveedores", 15);
	// 	modules.put("Ventas", 30);
		
	// 	int sum = modules.values().stream().reduce(0, Integer::sum);
	// 	System.out.println("Total de horas= "+ sum);
	// 	System.out.println("Costo total= "+ sum*450);
	// }
	
	// private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
	// 	System.out.println("Printing all even numbers in list: ");
	// 	//What to do?
	// 	numbers.stream()
	// 	.filter(number -> number%2 == 0)
	// 	.forEach(System.out::println); //method reference
	// }

	// private static void printAllNumbersInListFunctional(List<Integer> numbers) {
	// 	System.out.println("\nPrinting all numbers in list: ");
	// 	//What to do?
	// 	numbers.stream().forEach(System.out::println); //method reference
	// }

	// private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
	// 	System.out.println("\nPrinting the squares all even numbers in list: ");
	// 	//What to do?
	// 	numbers.stream()
	// 	.filter(number -> number%2 == 0)
	// 	.map(number -> number*number)
	// 	.forEach(System.out::println); //method reference
	// }
	
	// private static void printCubesOfOddNumbers(List<Integer> numbers) {
	// 	System.out.println("\nPrinting the cubes of all odd numbers in list: ");
	// 	//What to do?
	// 	numbers.stream()
	// 	.filter(number -> number%2 != 0)
	// 	.map(number -> number*number*number)
	// 	.forEach(System.out::println); //method reference
	// }
}

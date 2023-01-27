package javaCamp_2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(); // customerManager object is created so we can use
																	// CustomerManager class.
		// customer object is created in heap region in memory
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int number1 = 5;
		int number2 = 8;
		
		number2 = number1; // We assigned number2 to number1 so number2 shows the value of number1.
		number1 = 30;
		
		System.out.println(number2);
		// arrays
	
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		
		numbers2 = numbers1; // arrays are reference types. numbers1 and numbers2 shows to same values in
								// heap region.
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}
}

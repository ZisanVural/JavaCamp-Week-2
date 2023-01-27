package javaCamp_2;

public class Main {
	private static String number;

	public static void main(String[] args) {
		findingNumbers();
	}

	public static void findingNumbers() {
		{
			int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
			int willFind = 3;
			boolean itHas = false;
			for (int number : numbers) {
				if (number == willFind) {
					itHas = true;
					break;
				}
			}
			String message = "";
			if (itHas) {
				message = "Number is available: " + number;
				getMessage(message);
			} else {
				message = "number is not available: " + number;
				getMessage(message);
			}
		}
	}

	public static void getMessage(String message) {
		System.out.println(message);
	}
}

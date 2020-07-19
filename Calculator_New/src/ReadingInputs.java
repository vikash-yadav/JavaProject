import java.util.Scanner;

public class ReadingInputs {

	public String readInputString(String message) {
		Scanner intText = new Scanner(System.in);
		String yMsg = intText.nextLine();

		return "Dummy Value";
	}

	public int readInputNumber(String message) {
		Scanner intNum = new Scanner(System.in);
		int num1 = intNum.nextInt();

		return 0;
	}

	public static void OtherMethod() {

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter two numbers :");

		int num1 = val.nextInt();
		int num2 = val.nextInt();

		System.out.println("Please select an operator(+,-,*,/): ");

		char operator = val.next().charAt(0);

		Calculation.calcMethod();
	}

}

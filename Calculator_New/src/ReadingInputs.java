import java.util.Scanner;

public class ReadingInputs {
	
	public String readInputString(String message) {
		return "Dummy Value";
	}
	
	public int readInputNumber(String message) {
		return 0;
	}

	public String readInputString(String message) {
		Scanner inpText = new Scanner(System.in);
		String yMsg = inpText.nextLine();

		return "Dummy Value";
	}

	public int readInputNumber(String message) {
		Scanner inpNum = new Scanner(System.in);
		int num1 = inpNum.nextInt();

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

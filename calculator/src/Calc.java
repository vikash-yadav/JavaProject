import java.util.Scanner;

class Calc {

	public static void main(String args[]) {

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter two numbers :");

		int num1 = val.nextInt();
		int num2 = val.nextInt();

		System.out.println("Please select an operator(+,-,*,/): ");

		char operator = val.next().charAt(0);

		int result = 0;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;
		}

		System.out.println("Your answer is " + result);
	}
}
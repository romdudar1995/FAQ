package Interview;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("enter two numbers: ");

		double first = reader.nextDouble();
		double second = reader.nextDouble();

		System.out.println("Please enter an operator: ( + , - , * , / )");

		char operator = reader.next().charAt(0);
		reader.close();
		double result = 0;

		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;

		default:
			System.out.println("Please pass the correct operator");
			break;
		}

		System.out.println(result);

		
	}

}

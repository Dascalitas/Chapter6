package homeworkChapter6;

import java.util.Scanner;

public class Homework5 {

	public static double Celsius(double fahrenheit) {

		double celsius = 5.0 / 9.0 * (fahrenheit - 32);

		return celsius;
	}

	public static double Fahrenheit(double celsius) {

		double fahrenheit = 9.0 / 5.0 * celsius + 32;

		return fahrenheit;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter the type of temperature you have (c for Celsius, f for Fahrenheit):");
		char type = input.next().charAt(0);
		System.out.println("please enter the value you have :");
		double temp = input.nextDouble();

		if (type == 'c')
			System.out.printf("In Fahrenheit it will be %.2f f", Fahrenheit(temp));
		else if (type == 'f')
			System.out.printf("In Celsius it will be %.2f c", Celsius(temp));
		else
			System.out.println("you enter wrong parameter.");
	}
}

//6.22	(Temperature Conversions) Implement the following integer methods:
//a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation
//celsius = 5.0 / 9.0 * (fahrenheit - 32);
//b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the calculation
//fahrenheit = 9.0 / 5.0 * celsius + 32;
//c) Use the methods from parts (a) and (b) to write an application that enables the user either to enter
//a Fahrenheit temperature and display the Celsius equivalent or to enter a Celsius temperature and display the Fahrenheit equivalent.
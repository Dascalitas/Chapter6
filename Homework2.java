package homeworkChapter6;

import java.util.Scanner;

public class Homework2 {

	public static double Hipo(double cat1, double cat2) {

		double hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

		return hipo;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the adjacent side of triangle:");
		int cat1 = input.nextInt();
		System.out.println("enter the opposite side of triangle:");
		int cat2 = input.nextInt();

		System.out.println("The hypotenuse of this triangle is " + Hipo(cat1, cat2));
	}

}


//6.15	(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
//a right triangle when the lengths of the other two sides are given. The method should take two 
//arguments of type double and return the hypotenuse as a double. Incorporate this method into an 
//application that reads values for side1 and side2 and performs the calculation with the hypotenuse
//method.
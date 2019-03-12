package homeworkChapter6;

import java.util.Scanner;

public class Homework4 {

	public static void circleArea(int rad) {
		double area = Math.PI * (Math.pow(rad, 2));

		if (area > 0)
			System.out.printf("the area of the circle is %.2f", area);
		else
			System.out.println("you enter wrong radius.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter the radius of the circle :");
		circleArea(input.nextInt());

	}
}


//6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
//a method called circleArea to calculate the area of the circle. 
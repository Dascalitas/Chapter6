package homeworkChapter6;

import java.util.Scanner;

public class Homework6 {

	public static int number(int num) {

		int finNum = 0;
		int midNum;

		while (num > 0) {
			midNum = num % 10;
			finNum = finNum * 10 + midNum;
			num /= 10;
		}

		return finNum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter the number you want to reverse :");
		int num = input.nextInt();

		System.out.println("in reverse it will be " + number(num));
	}

}

//6.26	(Reversing Digits) Write a method that takes an integer value and returns the number with
//its digits reversed. For example, given the number 7631, the method should return 1367. 
//Incorporate the method into an application that reads a value from the user and displays the result

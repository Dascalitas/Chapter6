package homeworkChapter6;

import java.util.Scanner;
import java.security.SecureRandom;

public class Homework7 {

	public static int Flip() {

		SecureRandom randomNumbers = new SecureRandom();
		int side = 1 + randomNumbers.nextInt(2);

		return side;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int count = 0;
		int choose = 0;
		int heads = 0;
		int tails = 0;

		System.out.println(
				"Press 1 to toss the coin, or 2 to toss the coin. \nBut, if you want to exit, you must sacrifce the chiken in name of Satan. And click 3.");

		while (choose < 3) {

			choose = input.nextInt();

			if (choose < 3) {

				count++;

				switch (Flip()) {
				case 1:
					System.out.println("HEADS");
					heads++;
					System.out.println("Do you want to try again?");
					break;

				case 2:
					System.out.println("TAILS");
					tails++;
					System.out.println("Do you want to try again?");
					break;
				}
			}
		}

		System.out.printf(
				"OK. you toss %d times. For that %d times fall on HEAD side, and %d Times on TAIL side. \nAnd your soul is mine. Good luck in Hell. Bu-ga-ga-ga...",
				count, heads, tails);
	}

}

//(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
//each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
//the coin appears. Display the results. The program should call a separate method flip that takes no
//arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
//simulates coin tossing, each side of the coin should appear approximately half the time.]
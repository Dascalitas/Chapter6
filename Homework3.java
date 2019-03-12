package homeworkChapter6;

import java.util.Scanner;

public class Homework3 {

	public static void squareOfAsterisks(int side, char sym) {

		int counter = 0;

		while (counter < (Math.pow(side, 2))) {
			System.out.print(sym + " ");
			counter++;

			if (counter % side == 0)
				System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter the size of the cube :");
		int num = input.nextInt();
		System.out.println("please enter the symbol you want to use in cube constructing :");
		char sym = input.next().charAt(0);

		squareOfAsterisks(num, sym);
	}
}


//6.19	(Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive a second parameter of type char called fillCharacter.
//Form the square using the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
//#####
//#####
//#####
//#####
//#####
//Use the following statement (in which input is a Scanner object) to read a character from the user at the keyboard:
//char fill = input.next().charAt(0);

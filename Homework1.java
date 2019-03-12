package homeworkChapter6;

import java.util.Scanner;

public class Homework1 {

	public static double calculateCharges(int time) {

		double cost = 0;

		if (time < 1)
			cost = 0.00;
		else if (time > 0 && time < 4)
			cost = 2.00;
		else if (time > 3 && time < 19)
			cost = 2.00 + ((time - 3) * 0.5);
		else if (time > 18 && time < 25)
			cost = 10.00;
		else
			cost = 11.00;

		return cost;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 0;
		double total = 0;
		double cost;
		int time;

		System.out.printf("%s%n   %s%n   %s%n",

				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> D then press Enter", "On Windows type <Ctrl> Z then press Enter");

		while (input.hasNext()) {

			time = input.nextInt();
			cost = calculateCharges(time);
			total += cost;
			count++;

			if (cost < 2)
				System.out.println("\nYou don't stay at parking. Yet.");

			else if (cost >= 2 && cost <= 10)
				System.out.printf("\nYour car stay at parking %d hours. \nYou must to pay %.2f $", time, cost);

			else
				System.out.println("\nWe're sorry, your car got to impound");
		}
		System.out.println("\n__________________________________");
		System.out.printf("\nfor today was parked %d cars. \nThey paid %.2f $.", count, total);
	}

}


//6.8	(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
//hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//for each customer who parked in the garage yesterday. You should enter the hours parked for each
//customer. The program should display the charge for the current customer and should calculate and
//display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer. 
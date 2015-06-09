// Author: Diyang Qiu
// Date: 6/3/2015
// Project 13-1
// Class ReservationApp

import java.util.Scanner;
import java.util.*;


public class ReservationApp {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Welcome to the Reservation Calculator.");
	
	do
	{
		int arrMonth = getInt("\nEnter the arrival month (1-12): ");
		int arrDay = getInt("\nEnter the arrival day (1-31): ");
		int arrYear = getInt("\nEnter the arrival year: ");
		GregorianCalendar arrival = new GregorianCalendar(arrYear, arrMonth-1, arrDay);
		Date arrivalDate = arrival.getTime();
		
		int depMonth = getInt("\nEnter the departure month (1-12): ");
		int depDay = getInt("\nEnter the departure day (1-31): ");
		int depYear = getInt("\nEnter the departure year: ");
		GregorianCalendar departure = new GregorianCalendar(depYear, depMonth-1, depDay);
		Date departureDate = departure.getTime();
		
		Reservation res = new Reservation(arrivalDate, departureDate);
		
		System.out.println("\n" + res.toString() + "\n");
		System.out.println();
	}
	while(getAnother());
	}

	
	public static int getInt(String prompt)
	{
		int i = 0;
		boolean isValid = false;
		
		while (!isValid)
		{
			System.out.print(prompt);
			if (sc.hasNextInt())
					{
						i = sc.nextInt();
						isValid = true;
					}
			else 
			{
				System.out.println("Incorrect entry. Try again");
			}
			sc.nextLine();	
		}
			return i;
	}
	
	public static boolean getAnother()
	{
		System.out.print("Another reservation? (y/n): ");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("Y"))
			return true;
		else
			return false;
	}
}	
		

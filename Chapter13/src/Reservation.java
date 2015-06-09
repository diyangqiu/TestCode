// Author: Diyang Qiu
// Date: 6/3/2015
// Project 13-1
// Class Reservation

import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;


public class Reservation {

	private Date arrivalDate;
	private Date departureDate;
	public static double PRICE_PER_NIGHT = 115.0;
	
	public Reservation(Date arrival,Date departure)
	{
		this.arrivalDate = arrival;
	    this.departureDate = departure;
	}

	public double getTotalPrice()
	{
		int numOfNights = this.getNumOfNights();
		return PRICE_PER_NIGHT * numOfNights;
	}
	public int getNumOfNights()
	{
		long msArrival = arrivalDate.getTime();
		long msDeparture = departureDate.getTime();
		long numOfNights = (msDeparture - msArrival) / (24*60*60*1000);
		return (int) numOfNights;
	}
	
	public String toString()
	{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String s = "Arrival Date: " + df.format(arrivalDate) + "\n"
				+ "Departure Date " + df.format(departureDate) + "\n"
				+ "Total Price " + cf.format(getTotalPrice()) + "\n"
				+ "for " + this.getNumOfNights() + " Nights";
		return s;
	}
	
	
	
}

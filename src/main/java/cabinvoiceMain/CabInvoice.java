/*
 * Step-2_Invoice generator should take multiple rides.
 */
package cabinvoiceMain;

public class CabInvoice {
	public double COST_PER_KM = 10;
	public int COST_PER_TIME = 1;
	public int MINIMUM_FARE = 5;
	
	/**
	 * Method calculateFare  is used to calculate fare of cab service.
	 * @param distance
	 * @param time
	 * @return fare
	 */
	public double calculateFare(double distance,int time) {
		double fare = (COST_PER_KM * distance)+(COST_PER_TIME*time);
		return fare;
	}
	
	/**
	 * @purpose: Multiple Rides The invoice generator should now take in multiple
	 * rides, and calculate the aggregate total for all.
	 */
	public double calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Cab Invoice Service");
	}

}

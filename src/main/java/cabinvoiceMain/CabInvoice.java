/*
 * Step-1_Given distance and time , invoice generator should return total fare.
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

}

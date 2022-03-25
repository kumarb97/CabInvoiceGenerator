/*
 * Step-5_Premium Rides
 *        
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
		if(fare > MINIMUM_FARE) {
			return fare;
		}
		else {
			return (double)MINIMUM_FARE;
		}
	}
	
	/**
	 * @purpose: Multiple Rides The invoice generator should now take in multiple
	 * rides, and calculate the aggregate total for all.
	 */
	public double calculateFare1(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}
	
	public InvoiceSummary calculateFare2(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length,totalFare);
	}
	
	/***
     * created getRideType method define the type of ride
     * @param rideType - to compare given type
     */
    public void getRideType(String rideType) {
        String type = "Premium";
        if (rideType.equalsIgnoreCase(type)) {
            COST_PER_KM = 15;
            COST_PER_TIME = 2;
            MINIMUM_FARE = 20;
        }
    }
	
	public static void main(String[] args) {
		System.out.println("Welcome to Cab Invoice Service");
	}

}

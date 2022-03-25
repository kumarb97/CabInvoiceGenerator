package cabinvoiceMain;

public class InvoiceSummary {
	public int noOfRides;
	public double totalFare;
	public double averageFare;
	
	//constructor
	public InvoiceSummary(int noOfRides,double totalFare) {
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.averageFare =this.totalFare/this.noOfRides;
	}
	/*
	 * Equals method.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if (Double.doubleToLongBits(averageFare) != Double.doubleToLongBits(other.averageFare))
			return false;
		if (noOfRides != other.noOfRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}	

}

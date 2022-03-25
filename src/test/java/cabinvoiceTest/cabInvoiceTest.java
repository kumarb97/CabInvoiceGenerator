package cabinvoiceTest;

import org.junit.Assert;
import org.junit.Test;
import cabinvoiceMain.CabInvoice;
import cabinvoiceMain.Ride;

public class cabInvoiceTest {
	
	/*
	 * @Purpose : Testing code total fare of cab service we are getting or not.
	 */
	@Test
	public void givenDitanceAndTime_shouldReturnTotalFare(){
		CabInvoice cabinvoice = new CabInvoice();
		double result = cabinvoice.calculateFare(2.0,5);
		Assert.assertEquals(25,result,0.0);		
	}
	
	/*
	 * @Purpose : Testing code for total fare of multiple rides.
	 */
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		CabInvoice invoiceGenerator = new CabInvoice();
		Ride[] rides = { new Ride(2.0, 5), new Ride(1.0, 1) };
		double fare = invoiceGenerator.calculateFare(rides);
		Assert.assertEquals(36, fare, 0.0);
	}

}

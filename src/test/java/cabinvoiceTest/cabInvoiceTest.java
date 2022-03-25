/*
 * Step-3_Invoice generator should take multiple rides and gives average fare price
 *        and number of rides.
 */
package cabinvoiceTest;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import cabinvoiceMain.CabInvoice;
import cabinvoiceMain.Ride;
import cabinvoiceMain.InvoiceSummary;

public class cabInvoiceTest {
	CabInvoice cabinvoice = null;
	
	@Before
	public void setUp() throws Exception {
		cabinvoice = new CabInvoice();	 
	}
	
	/*
	 * @Purpose : Testing code total fare of cab service we are getting or not.
	 */
	@Test
	public void givenDitanceAndTime_shouldReturnTotalFare(){
		double result = cabinvoice.calculateFare(2.0,5);
		Assert.assertEquals(25,result,0.0);		
	}
	
	/*
	 * @Purpose : Testing code for total fare of multiple rides.
	 */
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(1.0, 1) };
		double fare = cabinvoice.calculateFare1(rides);
		Assert.assertEquals(36, fare, 0.0);
	}
	
	/*
	 * @Purpose : Testing code for Invoice summary returning averagefare
	 *            and number of rides.
	 */
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(1.0, 1) };
		InvoiceSummary summary = cabinvoice.calculateFare2(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2,36.0);
		Assert.assertEquals(expectedInvoiceSummary,summary);
	}
}

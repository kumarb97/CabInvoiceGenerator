/*
 * Step-4_Invoice Service
 *        
 */
package cabinvoiceTest;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import cabinvoiceMain.CabInvoice;
import cabinvoiceMain.Ride;
import cabinvoiceMain.InvoiceSummary;
import cabinvoiceMain.InvoiceService;

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
	
	/*
     * created givenUserID_ReturnInvoice method to test by giving userID
     * to return invoice
     */
    @Test
    public void givenUserID_ReturnInvoice(){
        Ride rides[] = { new Ride(1.1, 1),
                new Ride(10.0, 5),
                new Ride(5.0, 6),
                new Ride(8.9, 1),
                new Ride(9.0, 9) };
        int userID = 123;
        InvoiceService invoice1 = new InvoiceService(userID, rides);
        Assert.assertNotNull(invoice1);
    }
}

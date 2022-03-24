package cabinvoiceTest;

import org.junit.Assert;
import org.junit.Test;
import cabinvoiceMain.CabInvoice;

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
	

}

package cabinvoiceTest;

import org.junit.Assert;
import org.junit.Test;

import cabinvoiceMain.CabInvoice;
public class cabInvoiceTest {
	
	@Test
	public void givenDitanceAndTime_shouldReturnTotalFare(){
		CabInvoice cabinvoice = new CabInvoice();
		double result = cabinvoice.calculateFare(2.0,5);
		Assert.assertEquals(25,result,0.0);
		
		
	}
	

}

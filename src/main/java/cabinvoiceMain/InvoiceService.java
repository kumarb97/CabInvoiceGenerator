package cabinvoiceMain;

public class InvoiceService {
	 int userID;
     Ride[] rides;
     String invoice;
     InvoiceSummary totalFare;

    /***
     * created parameterized constructor
     * @param userID - to pass user ID
     * @param rides - to pass rides array
     */
    public InvoiceService(int userID, Ride[] rides) {
        this.userID = userID;
        this.rides = rides;
        CabInvoice invoice = new CabInvoice();
        this.totalFare = invoice.calculateFare2(rides);
        this.invoice = userID + ", " + rides + ", " + totalFare;
    }

}

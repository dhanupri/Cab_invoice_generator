import org.junit.Assert;
import org.junit.Test;

public class CabServiceTest {
    @Test
    public void testGenerateInvoice(){
        Invoice invoice=new Invoice();
        Cab cab=new Cab(1,"tn1234");
        Ride ride=new Ride(1,"aishu",cab,8,"10");

        Assert.assertEquals(90,invoice.totalFare(ride,10,1));
    }

}

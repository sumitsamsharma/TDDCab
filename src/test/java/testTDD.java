import org.junit.Assert;
import org.junit.Test;

public class testTDD {

 /*   @Test
    public void given_Mins_dist_ReturnAmount() {
        CabMethods cabService = new CabMethods();
        long fare = cabService.totalFare(2, 2);
        Assert.assertEquals(22, fare);
    }

    @Test
    public void given_Mins_dist_ReturnAmount_Multiple_trips() {
        CabMethods cabService = new CabMethods();
        cabService.totalFare(2, 2);
        cabService.totalFare(0, 0);
        cabService.totalFare(1, 1);
        Assert.assertEquals(38, cabService.totalAmt);
    }

    @Test
    public void given_Mins_dist_Return_TotalRides() {
        CabMethods cabService = new CabMethods();
        cabService.totalFare(2, 2);
        cabService.totalFare(0, 0);
        cabService.totalFare(1, 1);
        Assert.assertEquals(3, cabService.totalRides);
    }

    @Test
    public void given_Mins_dist_forMultipleRides_Return_AvgFare() {
        CabMethods cabService = new CabMethods();
        cabService.totalFare(2, 2);
        cabService.totalFare(0, 0);
        cabService.totalFare(1, 1);
        cabService.totalFare(1, 1);
        Assert.assertEquals(12.0, cabService.avgFare(), 0);
    }
*/
    @Test
    public void givenUserId_shouldReturnInvoice() {
        CabMethods cabService = new CabMethods();
        cabService.totalFare("Abc", 5, 0);
        cabService.totalFare("Abc", 10, 1);
        cabService.totalFare("Abc", 5, 9);

        long total = cabService.rideRepostitory("Abc").totalAmount;
        System.out.println(total);
        Assert.assertEquals(120, total);
    }
}

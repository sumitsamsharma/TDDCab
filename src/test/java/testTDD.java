import org.junit.Assert;
import org.junit.Test;

public class testTDD {

    @Test
    public void given_Mins_dist_ReturnAmount() {
        CabMethods cabService = new CabMethods();
        long fare = cabService.totalFare(2,2);
        Assert.assertEquals(22,fare);
    }
}

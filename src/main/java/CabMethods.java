public class CabMethods
{
    public int totalAmt=0;
    public long totalFare(Integer time, Integer dist)
    {

        try
        {
            long amount = time + dist * 10;
            if (amount<5) {
                amount = 5;
                totalAmt += 5;
            }
            else{
                totalAmt+=amount;}
            return amount;
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
            return 0;
        }
    }

    public static void main(String args[])
    {
        System.out.println( "Welcome to the cab service");
    }
}

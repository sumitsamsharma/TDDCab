public class CabMethods
{
    public long totalFare(Integer time, Integer dist){
        try
        {
            long amount = time + dist * 10;
            return (amount>5)? amount:5;
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

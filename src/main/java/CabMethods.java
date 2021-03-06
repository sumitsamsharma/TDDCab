import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class CabMethods
{
    public int totalAmt=0;
    public int totalRides=0;
    public HashMap<String,ArrayList<Long>> ridesDict = new HashMap<>();
    public ArrayList<Long> fares;
    public long totalFare(String Id,type rideType,Integer time, Integer dist)
    {
        try {
            long fare=0;
            if (rideType == type.Normal) {
                fare = calcAmt(time, dist);
                System.out.println("Fare: " + fare);
                ArrayList<Long> rides = new ArrayList<>();
                if (ridesDict.containsKey(Id)) {
                    rides = ridesDict.get(Id);
                    rides.add(fare);
                    ridesDict.put(Id, rides);
                    System.out.println("Initial Mappings are: " + ridesDict);
                } else {
                    rides.add(fare);
                    ridesDict.put(Id, rides);
                    System.out.println("Initial Mappings are: " + ridesDict);
                }
                totalRides++;
            }

            else if(rideType == type.Premium)
            {
                fare = PremiumCharges(time, dist);
                System.out.println("Fare: " + fare);
                ArrayList<Long> rides = new ArrayList<>();
                if (ridesDict.containsKey(Id)) {
                    rides = ridesDict.get(Id);
                    rides.add(fare);
                    ridesDict.put(Id, rides);
                    System.out.println("Initial Mappings are: " + ridesDict);
                } else {
                    rides.add(fare);
                    ridesDict.put(Id, rides);
                    System.out.println("Initial Mappings are: " + ridesDict);
                }
                totalRides++;
            }
            return fare;
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
            return 0;
        }

    }

    public enum type{
        Normal,Premium;
    }

    public double avgFare()
    {
        return totalAmt/totalRides;
    }

    public Invoice rideRepostitory(String Id){
        fares=ridesDict.get(Id);
        long totalFare=0;
        for (long i: fares)
        {
            totalFare += i;
        }
        long total_rides = fares.size();
        double average = totalFare/total_rides;
        return new Invoice(Id,totalFare,totalRides,average);
    }

    public long PremiumCharges(Integer mins, Integer dist)
    {
        long charge = mins*2 + dist * 15;
        if (charge < 20) {
            return 20;
        }
        return charge;
    }

    public long calcAmt (Integer time, Integer dist)
    {
        long amount = time + dist * 10;
        if (amount<5) {
            amount = 5;
            return amount;
        }
        return amount;
    }

    public static void main(String args[])
    {
        System.out.println( "Welcome to the cab service");
    }
}

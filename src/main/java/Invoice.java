import java.util.ArrayList;
import java.util.List;

public class Invoice {
    List<Ride> rides=new ArrayList<>();
    Ride ride1;
    public void insert(Ride ride){
        rides.add(ride);
    }
    //Calculate Fare
    public int totalFare(Ride ride,int perkm,int permin){
        int totalfare=(ride.getKm()*perkm)+(Integer.parseInt(ride.getTime())*permin);
        return totalfare;
    }
}

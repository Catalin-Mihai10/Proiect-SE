package DataTypes;

import com.google.gson.annotations.SerializedName;
import java.util.*;

public class Offers {
    @SerializedName("vacations")
    private List<Vacation> offers;

    public Offers(){
        offers = new ArrayList<>();
    }

    public void addOffer(Vacation vacation){
        if(!offers.contains(vacation))
            offers.add(vacation);
    }

    public void removeOffer(Vacation vacation){
        if(offers.contains(vacation))
            offers.remove(vacation);
    }

    public List<Vacation> getOffers(){
        return offers;
    }
}

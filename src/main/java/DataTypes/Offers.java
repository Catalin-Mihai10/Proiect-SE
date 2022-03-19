package DataTypes;

import java.util.*;

public class Offers {
    private List<Vacation> offers = new ArrayList<>();

    public Offers(){}

    public void addOffer(Vacation vacation){
        if(!offers.contains(vacation))
            offers.add(vacation);
    }

    public void setOffers(List<Vacation> offers){
        this.offers = offers;
    }

    public void removeOffer(Vacation vacation){
        if(offers.contains(vacation))
            offers.remove(vacation);
    }

    public List<Vacation> getOffers(){
        return offers;
    }

    public String toString(){
        String offersList = "";

        for(Vacation v : offers)
            offersList += v.toString() + Constants.NEW_LINE;

        return offersList;
    }
}

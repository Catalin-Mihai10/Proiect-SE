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
        offers.remove(vacation);
    }

    public List<Vacation> getOffers(){
        return offers;
    }

    public String toString(){
        StringBuilder offersList = new StringBuilder();

        for(Vacation v : offers)
            offersList.append(v.toString()).append(Constants.NEW_LINE);

        return offersList.toString();
    }
}

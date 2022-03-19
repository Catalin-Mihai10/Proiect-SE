package Utilities;

import DataTypes.Constants;
import DataTypes.Offers;
import DataTypes.Vacation;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.*;

public class Serializer {
    private String serializedData;
    private Offers deserializedData;

    public Serializer(){
        serializedData = Constants.OFFERS +
                         Constants.LINE_SEPARATOR +
                         Constants.NEW_LINE;
        deserializedData = new Offers();
    }

    public String serializeData(Offers offers){

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Vacation.class, new VacationAdapter())
                .setPrettyPrinting()
                .create();

        serializedData += gson.toJson(offers.getOffers());

        return serializedData;
    }

    public Offers deserializeData(BufferedReader bufferedReader){
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Offers.class, new OffersAdapter())
                .setPrettyPrinting()
                .create();

        Offers offers = gson.fromJson(bufferedReader, Offers.class);

        deserializedData = offers;

        return deserializedData;
    }


}

package Utilities;

import DataTypes.Vacation;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.util.*;

public class Serializer {
    private String serializedData;
    private List<Vacation> deserializedData;

    public Serializer(){
        serializedData = "";
        deserializedData = new ArrayList<>();
    }

    public String serializeData(List<Vacation> vacations){

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        serializedData = gson.toJson(vacations);

        return serializedData;
    }

    public List<Vacation> deserializeData(BufferedReader bufferedReader){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Vacation[] vacations = gson.fromJson(bufferedReader, Vacation[].class);
        deserializedData = Arrays.asList(vacations);

        return deserializedData;
    }


}

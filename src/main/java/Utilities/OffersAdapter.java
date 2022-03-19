package Utilities;

import DataTypes.Constants;
import DataTypes.Enums;
import DataTypes.Offers;
import DataTypes.Vacation;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.*;

import java.io.IOException;

public class OffersAdapter extends TypeAdapter<Offers> {
    @Override
    public void write(JsonWriter jsonWriter, Offers offers) throws IOException {
            jsonWriter.beginObject();
            jsonWriter.name(Constants.OFFERS);
            jsonWriter.value((Number) offers.getOffers());
            jsonWriter.endObject();
    }

    @Override
    public Offers read(JsonReader jsonReader) throws IOException {
        Offers offers = new Offers();
        jsonReader.beginObject();
        String fieldName = Constants.EMPTY;
        List<Vacation> vacationsTemp = new ArrayList<>();

        while(jsonReader.hasNext())
        {
            JsonToken jsonToken = jsonReader.peek();

            if(jsonToken.equals(JsonToken.NAME))
                fieldName = jsonReader.nextName();

                if(Constants.OFFERS.equals(fieldName)){
                    jsonToken = jsonReader.peek();
                    //String list = jsonReader.nextString();
                    jsonReader.beginArray();
                    while(jsonReader.hasNext()){
                        Vacation vacation = new Vacation();
                        jsonReader.beginObject();
                        String fieldNameV = Constants.EMPTY;

                        while(jsonReader.hasNext())
                        {
                            JsonToken jsonTokenV = jsonReader.peek();

                            if(jsonTokenV.equals(JsonToken.NAME))
                                fieldNameV = jsonReader.nextName();

                            if(Constants.NAME.equals(fieldNameV)){
                                jsonTokenV = jsonReader.peek();
                                vacation.setName(jsonReader.nextString());
                            }

                            if(Constants.DESCRIPTION.equals(fieldNameV)){
                                jsonTokenV = jsonReader.peek();
                                vacation.setDescription(jsonReader.nextString());
                            }

                            if(Constants.AGE.equals(fieldNameV)){
                                jsonTokenV = jsonReader.peek();
                                vacation.setAge(jsonReader.nextString());
                            }

                            if(Constants.TEMPERATURE.equals(fieldNameV)){
                                jsonTokenV = jsonReader.peek();
                                vacation.setTemperature(Enums.Temperature.valueOf(jsonReader.nextString()));
                            }

                            if(Constants.ACTIVITY.equals(fieldNameV)){
                                jsonTokenV = jsonReader.peek();
                                vacation.setActivity(Enums.Activities.valueOf(jsonReader.nextString()));
                            }

                            if(Constants.BUDGET.equals(fieldNameV)){
                                jsonTokenV = jsonReader.peek();
                                vacation.setBudget(Enums.Budget.valueOf(jsonReader.nextString()));
                            }

                            if(Constants.LOCATION.equals(fieldNameV)){
                                jsonTokenV = jsonReader.peek();
                                vacation.setLocation(Enums.Locations.valueOf(jsonReader.nextString()));
                            }
                        }
                        jsonReader.endObject();
                        vacationsTemp.add(vacation);
                    }
                    jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        offers.setOffers(vacationsTemp);

        return offers;
    }
}

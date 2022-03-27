package Utilities;

import DataTypes.Constants;
import DataTypes.Enums;
import DataTypes.Vacation;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class VacationAdapter extends TypeAdapter<Vacation> {
    @Override
    public void write(JsonWriter jsonWriter, Vacation vacation) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name(Constants.NAME);
        jsonWriter.value(vacation.getName());
        jsonWriter.name(Constants.DESCRIPTION);
        jsonWriter.value(vacation.getDescription());
        jsonWriter.name(Constants.AGE);
        jsonWriter.value(String.valueOf(vacation.getAge()));
        jsonWriter.name(Constants.TEMPERATURE);
        jsonWriter.value(String.valueOf(vacation.getTemperature()));
        jsonWriter.name(Constants.ACTIVITY);
        jsonWriter.value(String.valueOf(vacation.getActivity()));
        jsonWriter.name(Constants.BUDGET);
        jsonWriter.value(String.valueOf(vacation.getBudget()));
        jsonWriter.name(Constants.LOCATION);
        jsonWriter.value(String.valueOf(vacation.getLocation()));
        jsonWriter.endObject();
    }

    @Override
    public Vacation read(JsonReader jsonReader) throws IOException {
        Vacation vacation = new Vacation(Constants.EMPTY,Constants.EMPTY,
                                         null, null,null,
                                         null,null);
        jsonReader.beginObject();
        String fieldName = Constants.EMPTY;

        while(jsonReader.hasNext())
        {
            JsonToken jsonToken = jsonReader.peek();

            if(jsonToken.equals(JsonToken.NAME))
                fieldName = jsonReader.nextName();

            if(Constants.NAME.equals(fieldName)){
                jsonToken = jsonReader.peek();
                vacation.setName(jsonReader.nextString());
            }

            if(Constants.DESCRIPTION.equals(fieldName)){
                jsonToken = jsonReader.peek();
                vacation.setDescription(jsonReader.nextString());
            }

            if(Constants.AGE.equals(fieldName)){
                jsonToken = jsonReader.peek();
                vacation.setAge(Enums.Age.convertFromStringToAge(jsonReader.nextString()));
            }

            if(Constants.TEMPERATURE.equals(fieldName)){
                jsonToken = jsonReader.peek();
                vacation.setTemperature(Enums.Temperature.convertFromStringToTemperature(jsonReader.nextString()));
            }

            if(Constants.ACTIVITY.equals(fieldName)){
                jsonToken = jsonReader.peek();
                vacation.setActivity(Enums.Activities.convertFromStringToActivity(jsonReader.nextString()));
            }

            if(Constants.BUDGET.equals(fieldName)){
                jsonToken = jsonReader.peek();
                vacation.setBudget(Enums.Budget.convertFromStringToBudget(jsonReader.nextString()));
            }

            if(Constants.LOCATION.equals(fieldName)){
                jsonToken = jsonReader.peek();
                vacation.setLocation(Enums.Locations.convertFromStringToBudget(jsonReader.nextString()));
            }

        }
        jsonReader.endObject();
        return vacation;
    }
}

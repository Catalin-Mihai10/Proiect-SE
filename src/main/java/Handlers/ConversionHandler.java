package Handlers;

import DataTypes.Constants;
import DataTypes.Enums;
import DataTypes.Vacation;

public class ConversionHandler {
    private final Vacation vacation = new Vacation(Constants.EMPTY, Constants.EMPTY,null,
                                   null, null, null, null);

    public ConversionHandler(){}

    public Vacation convertFromUserInput(String name,
                                     String description,
                                     String age,
                                     String temperature,
                                     String activity,
                                     String budget,
                                     String location){

        vacation.setName(name);
        vacation.setDescription(description);
        vacation.setAge(convertAge(age));
        vacation.setTemperature(convertTemperature(temperature));
        vacation.setActivity(convertActivity(activity));
        vacation.setBudget(convertBudget(budget));
        vacation.setLocation(convertLocation(location));

        return vacation;
    }

    public Enums.Age convertAge(String age){
        return Enums.Age.convertFromStringToAge(age);
    }

    public Enums.Temperature convertTemperature(String temperature){
        return Enums.Temperature.convertFromStringToTemperature(temperature);
    }

    public Enums.Activities convertActivity(String activity){
        return Enums.Activities.convertFromStringToActivity(activity);
    }

    public Enums.Budget convertBudget(String budget){
        return Enums.Budget.convertFromStringToBudget(budget);
    }

    public Enums.Locations convertLocation(String location){
        return Enums.Locations.convertFromStringToBudget(location);
    }
}

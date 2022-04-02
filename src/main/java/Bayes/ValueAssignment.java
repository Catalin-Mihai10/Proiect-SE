package Bayes;

import DataTypes.Constants;
import DataTypes.Enums;
import DataTypes.Vacation;

import java.util.*;

public class ValueAssignment {

    private Enums.Locations location = null;
    private final Map<Enums.Age, Double> ageMap = new HashMap<>();
    private final Map<Enums.Temperature, Double> temperatureMap = new HashMap<>();
    private final Map<Enums.Activities, Double> activitiesMap = new HashMap<>();
    private final Map<Enums.Budget, Double> budgetMap = new HashMap<>();
    public ValueAssignment(){}

    public void assingValues(Vacation vacation){
        mapAgeValues(vacation.getAge(), ageMap);
        mapTemperatureValues(vacation.getTemperature(), temperatureMap);
        mapActivitiesValues(vacation.getActivity(), activitiesMap);
        mapBudgetValues(vacation.getBudget(), budgetMap);
        location = vacation.getLocation();
    }

    public Double getAgeValue(Enums.Age age){ return ageMap.get(age); }
    public Double getTemperatureValue(Enums.Temperature temperature){ return temperatureMap.get(temperature); }
    public Double getActivitiesValue(Enums.Activities activity) { return activitiesMap.get(activity); }
    public Double getBudgetValue(Enums.Budget budget) { return budgetMap.get(budget); }
    public Enums.Locations getLocationsValue() { return location;}

    public void mapAgeValues(Enums.Age age, Map<Enums.Age, Double> ageMap)
    {
        switch (age)
        {
            case YOUNG -> {
                ageMap.put(Enums.Age.YOUNG, Constants.MAX_VALUE);
                ageMap.put(Enums.Age.MIDDLE, Constants.MIN_VALUE);
                ageMap.put(Enums.Age.OLD, Constants.MIN_VALUE);
                break;
            }
            case MIDDLE -> {
                ageMap.put(Enums.Age.YOUNG, Constants.MIN_VALUE);
                ageMap.put(Enums.Age.MIDDLE, Constants.MAX_VALUE);
                ageMap.put(Enums.Age.OLD, Constants.MIN_VALUE);
                break;
            }
            case OLD -> {
                ageMap.put(Enums.Age.YOUNG, Constants.MIN_VALUE);
                ageMap.put(Enums.Age.MIDDLE, Constants.MIN_VALUE);
                ageMap.put(Enums.Age.OLD, Constants.MAX_VALUE);
                break;
            }
        }
    }


    public void mapTemperatureValues(Enums.Temperature temperature, Map<Enums.Temperature, Double> temperatureMap)
    {
        switch (temperature)
        {
            case COLD -> {
                temperatureMap.put(Enums.Temperature.COLD, Constants.MAX_VALUE);
                temperatureMap.put(Enums.Temperature.TEMPERATE, Constants.MIN_VALUE);
                temperatureMap.put(Enums.Temperature.WARM, Constants.MIN_VALUE);
                temperatureMap.put(Enums.Temperature.IRRELEVANT, Constants.MIN_VALUE);
                break;
            }
            case TEMPERATE -> {
                temperatureMap.put(Enums.Temperature.COLD, Constants.MIN_VALUE);
                temperatureMap.put(Enums.Temperature.TEMPERATE, Constants.MAX_VALUE);
                temperatureMap.put(Enums.Temperature.WARM, Constants.MIN_VALUE);
                temperatureMap.put(Enums.Temperature.IRRELEVANT, Constants.MIN_VALUE);
                break;
            }
            case WARM -> {
                temperatureMap.put(Enums.Temperature.COLD, Constants.MIN_VALUE);
                temperatureMap.put(Enums.Temperature.TEMPERATE, Constants.MIN_VALUE);
                temperatureMap.put(Enums.Temperature.WARM, Constants.MAX_VALUE);
                temperatureMap.put(Enums.Temperature.IRRELEVANT, Constants.MIN_VALUE);
                break;
            }
            case IRRELEVANT -> {
                temperatureMap.put(Enums.Temperature.COLD, Constants.MAX_VALUE);
                temperatureMap.put(Enums.Temperature.TEMPERATE, Constants.MAX_VALUE);
                temperatureMap.put(Enums.Temperature.WARM, Constants.MAX_VALUE);
                temperatureMap.put(Enums.Temperature.IRRELEVANT, Constants.MAX_VALUE);
                break;
            }
        }
    }

    public void mapActivitiesValues(Enums.Activities activity, Map<Enums.Activities, Double> activitiesMap)
    {
        switch (activity)
        {
            case RELAXING -> {
                activitiesMap.put(Enums.Activities.RELAXING, Constants.MAX_VALUE);
                activitiesMap.put(Enums.Activities.RECREATIONAL, Constants.MIN_VALUE);
                activitiesMap.put(Enums.Activities.SPORTS, Constants.MIN_VALUE);
                activitiesMap.put(Enums.Activities.IRRELEVANT, Constants.MIN_VALUE);
                break;
            }
            case RECREATIONAL -> {
                activitiesMap.put(Enums.Activities.RELAXING, Constants.MIN_VALUE);
                activitiesMap.put(Enums.Activities.RECREATIONAL, Constants.MAX_VALUE);
                activitiesMap.put(Enums.Activities.SPORTS, Constants.MIN_VALUE);
                activitiesMap.put(Enums.Activities.IRRELEVANT, Constants.MIN_VALUE);
                break;
            }
            case SPORTS -> {
                activitiesMap.put(Enums.Activities.RELAXING, Constants.MIN_VALUE);
                activitiesMap.put(Enums.Activities.RECREATIONAL, Constants.MIN_VALUE);
                activitiesMap.put(Enums.Activities.SPORTS, Constants.MAX_VALUE);
                activitiesMap.put(Enums.Activities.IRRELEVANT, Constants.MIN_VALUE);
                break;
            }
            case IRRELEVANT -> {
                activitiesMap.put(Enums.Activities.RELAXING, Constants.MAX_VALUE);
                activitiesMap.put(Enums.Activities.RECREATIONAL, Constants.MAX_VALUE);
                activitiesMap.put(Enums.Activities.SPORTS, Constants.MAX_VALUE);
                activitiesMap.put(Enums.Activities.IRRELEVANT, Constants.MAX_VALUE);
                break;
            }
        }
    }

    public void mapBudgetValues(Enums.Budget budget, Map<Enums.Budget, Double> budgetMap) {
        switch (budget)
        {
            case REDUCED -> {
                budgetMap.put(Enums.Budget.REDUCED, Constants.MAX_VALUE);
                budgetMap.put(Enums.Budget.MEDIUM, Constants.MIN_VALUE);
                budgetMap.put(Enums.Budget.LARGE, Constants.MIN_VALUE);
                break;
            }
            case MEDIUM -> {
                budgetMap.put(Enums.Budget.REDUCED, Constants.MIN_VALUE);
                budgetMap.put(Enums.Budget.MEDIUM, Constants.MAX_VALUE);
                budgetMap.put(Enums.Budget.LARGE, Constants.MIN_VALUE);
                break;
            }
            case LARGE -> {
                budgetMap.put(Enums.Budget.REDUCED, Constants.MIN_VALUE);
                budgetMap.put(Enums.Budget.MEDIUM, Constants.MIN_VALUE);
                budgetMap.put(Enums.Budget.LARGE, Constants.MAX_VALUE);
                break;
            }
        }
    }

}

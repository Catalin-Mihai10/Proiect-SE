package Bayes;

import DataTypes.Constants;
import DataTypes.Enums;
import DataTypes.Vacation;

import java.util.*;

public class ValueAssignment {

    private Enums.Age age = null;
    private final Map<Enums.Temperature, Double> temperatureMap = new HashMap<>();
    private final Map<Enums.Activities, Double> activitiesMap = new HashMap<>();
    private final Map<Enums.Budget, Double> budgetMap = new HashMap<>();
    private final Map<Enums.Locations, Double> locationsMap = new HashMap<>();

    public ValueAssignment(){}

    public void assingValues(Vacation vacation){
        age = vacation.getAge();
        mapTemperatureValues(vacation, temperatureMap);
        mapActivitiesValues(vacation, activitiesMap);
        mapBudgetValues(vacation, budgetMap);
        mapLocationsValues(vacation, locationsMap);
    }

    public Enums.Age getAgeValue(){ return age; }
    public Double getTemperatureValue(Enums.Temperature temperature){ return temperatureMap.get(temperature); }
    public Double getActivitiesValue(Enums.Activities activity) { return activitiesMap.get(activity); }
    public Double getBudgetValue(Enums.Budget budget) { return budgetMap.get(budget); }
    public Double getLocationsValue(Enums.Locations location) { return locationsMap.get(location); }

    public void mapTemperatureValues(Vacation vacation, Map<Enums.Temperature, Double> temperatureMap)
    {
        switch (vacation.getTemperature())
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

    public void mapActivitiesValues(Vacation vacation, Map<Enums.Activities, Double> activitiesMap)
    {
        switch (vacation.getActivity())
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

    public void mapBudgetValues(Vacation vacation, Map<Enums.Budget, Double> budgetMap) {
        switch (vacation.getBudget()) {
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

    public void mapLocationsValues(Vacation vacation, Map<Enums.Locations, Double> locationsMap)
    {
        switch (vacation.getLocation()) {
            case COUNTRY -> {
                locationsMap.put(Enums.Locations.COUNTRY, Constants.MAX_VALUE);
                locationsMap.put(Enums.Locations.EUROPE, Constants.MIN_VALUE);
                locationsMap.put(Enums.Locations.GLOBAL, Constants.MIN_VALUE);
                break;
            }
            case EUROPE -> {
                locationsMap.put(Enums.Locations.COUNTRY, Constants.MIN_VALUE);
                locationsMap.put(Enums.Locations.EUROPE, Constants.MAX_VALUE);
                locationsMap.put(Enums.Locations.GLOBAL, Constants.MIN_VALUE);
                break;
            }
            case GLOBAL -> {
                locationsMap.put(Enums.Locations.COUNTRY, Constants.MIN_VALUE);
                locationsMap.put(Enums.Locations.EUROPE, Constants.MIN_VALUE);
                locationsMap.put(Enums.Locations.GLOBAL, Constants.MAX_VALUE);
                break;
            }
        }
    }

}

package Bayes;

import DataTypes.Constants;
import DataTypes.Vacation;

import java.util.*;

public class BayesInference {

    Map<Vacation, Double> valuesOfProbability = new HashMap<>();
    List<Double> propositionalVariables = new ArrayList<>(5);
    ValueAssignment valueAssignment;

    public BayesInference(ValueAssignment valueAssignment){
        this.valueAssignment = valueAssignment;
    }

    public void createInference(List<Vacation> vacationList)
    {
        for(Vacation vacation : vacationList){
            valuesOfProbability.put(vacation, calculateConditionalProbability(vacation));
        }
    }

    public Double calculateConditionalProbability(Vacation vacation){
        propositionalVariables.set(0, valueAssignment.getAgeValue(vacation.getAge()));
        propositionalVariables.set(1, valueAssignment.getTemperatureValue(vacation.getTemperature()));
        propositionalVariables.set(2, valueAssignment.getActivitiesValue(vacation.getActivity()));
        propositionalVariables.set(3, valueAssignment.getBudgetValue(vacation.getBudget()));
        propositionalVariables.set(4, valueAssignment.getLocationsValue(vacation.getLocation()));



        return Constants.MIN_VALUE;
    }
}

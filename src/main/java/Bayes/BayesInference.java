package Bayes;

import DataTypes.Constants;
import DataTypes.Vacation;

import java.util.*;
import java.util.stream.Collectors;

public class BayesInference {

    private final Map<Vacation, Double> valuesOfProbability = new HashMap<>();
    private final List<Integer[]> S = new ArrayList<>();
    private final ValueAssignment valueAssignment;

    private int CARD_ALPHA= 1;

    public BayesInference(ValueAssignment valueAssignment){
        this.valueAssignment = valueAssignment;
    }

    public void createInference(List<Vacation> vacationList)
    {
        CARD_ALPHA = vacationList.size();
        List<Vacation> omega = populateOmega(vacationList);

        double CARD_VK = Constants.MAX_VALUE;
        Double P_VK = CARD_VK / CARD_ALPHA;
        Double P_S_VK;
        double P_VK_S;

        generateSet();

        Double p_S = calculateSP(omega, S);

        for (Vacation vacation : omega){
            P_S_VK = calculateICardinal(vacation, S);
            P_VK_S = (P_S_VK * P_VK)/ p_S;
            valuesOfProbability.put(vacation, P_VK_S);
        }

    }

    private Double calculateSP(List<Vacation> list, List<Integer[]> set){
        double probability = Constants.MIN_VALUE;
        int CARD_OMEGA = list.size();
        Double P_VJ = Constants.MAX_VALUE / CARD_OMEGA;

        for(Vacation vacation : list){
            Double P_S_VJ = calculateICardinal(vacation, set);
            probability += P_S_VJ * P_VJ;
        }

        return probability;
    }

    private Double calculateICardinal(Vacation vacation, List<Integer[]> set){
        int auxValue = 0;
        boolean entered = false;
        double AUX_P_CX_D = Constants.MAX_VALUE;

            for(Integer[] integers : set){
                if(
                        (valueAssignment.getAgeValue(vacation.getAge()) == (double) integers[0]) &&
                                (valueAssignment.getTemperatureValue(vacation.getTemperature()) == (double) integers[1]) &&
                                (valueAssignment.getActivitiesValue(vacation.getActivity()) == (double) integers[2]) &&
                                (valueAssignment.getBudgetValue(vacation.getBudget()) == (double) integers[3])
                ) {

                    for (Integer integer : integers) if (integer == 1) auxValue++;

                    entered = true;
                    AUX_P_CX_D *= (double) auxValue/CARD_ALPHA;
                    auxValue = 0;
                }
            }

        if(!entered) AUX_P_CX_D = Constants.MIN_VALUE;

        return AUX_P_CX_D;
    }

    private void generateSet(){
        Integer[] tempList = new Integer[4];
        generateAllCombinations(4,tempList, 0);
    }

    private void generateAllCombinations(int n, Integer[] tempList, int i){

        if(i == n){
            Integer[] aux = new Integer[4];
            System.arraycopy(tempList, 0, aux, 0, tempList.length);
            S.add(aux);
            return;
        }

        tempList[i] = 0;
        generateAllCombinations(n, tempList, i+1);

        tempList[i] = 1;
        generateAllCombinations(n, tempList, i+1);

    }

    private List<Vacation> populateOmega(List<Vacation> vacationList){
        List<Vacation> tempArray = new ArrayList<>();

        for(Vacation vacation : vacationList)
            if(vacation.getLocation() == valueAssignment.getLocationsValue())
                tempArray.add(vacation);

        return tempArray;
    }

    public List<Vacation> getValuesOfProbability(){
        Map<Vacation, Double> resultsMap = valuesOfProbability.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> newValue, LinkedHashMap::new
                ));

        return new ArrayList<>(new HashSet<>(resultsMap.keySet())).stream().limit(10).toList();
    }

}

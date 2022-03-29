package DataTypes;

public class Enums {

    public enum Age
    {
        YOUNG,
        MIDDLE,
        OLD,
        UNDEFINED;

        public static Age convertFromStringToAge(String age)
        {
            Age returnedTemperature;
            switch (age)
            {
                case Constants.CHOSEN_AGE_YOUNG -> {
                    returnedTemperature =  YOUNG;
                    break;
                }
                case Constants.CHOSEN_AGE_MIDDLE -> {
                    returnedTemperature = MIDDLE;
                    break;
                }
                case Constants.CHOSEN_AGE_OLD ->  {
                    returnedTemperature = OLD;
                    break;
                }

                default -> {
                    returnedTemperature = UNDEFINED;
                    break;
                }
            }
            return returnedTemperature;
        }
    }

    public enum Temperature
    {
        COLD,
        TEMPERATE,
        WARM,
        IRRELEVANT,
        UNDEFINED;

        public static Temperature convertFromStringToTemperature(String temperature)
        {
            Temperature returnedTemperature;
            switch (temperature)
            {
                case Constants.CHOSEN_TEMPERATURE_COLD, Constants.USER_CHOSEN_TEMPERATURE_COLD -> {
                    returnedTemperature =  COLD;
                    break;
                }
                case Constants.CHOSEN_TEMPERATURE_TEMPERATE, Constants.USER_CHOSEN_TEMPERATURE_TEMPERATE -> {
                    returnedTemperature = TEMPERATE;
                    break;
                }
                case Constants.CHOSEN_TEMPERATURE_WARM, Constants.USER_CHOSEN_TEMPERATURE_WARM ->  {
                    returnedTemperature = WARM;
                    break;
                }
                case Constants.IRRELEVANT, Constants.USER_IRRELEVANT -> {
                    returnedTemperature = IRRELEVANT;
                    break;
                }

                default -> {
                    returnedTemperature = UNDEFINED;
                    break;
                }
            }
            return returnedTemperature;
        }

    }

    public enum Activities
    {
        RELAXING,
        RECREATIONAL,
        SPORTS,
        IRRELEVANT,
        UNDEFINED;

        public static Activities convertFromStringToActivity(String activity)
        {
            Activities returnedActivity;
            switch (activity)
            {
                case Constants.CHOSEN_ACTIVITY_RELAXING, Constants.USER_CHOSEN_ACTIVITY_RELAXING -> {
                    returnedActivity =  RELAXING;
                    break;
                }
                case Constants.CHOSEN_ACTIVITY_RECREATIONAL, Constants.USER_CHOSEN_ACTIVITY_RECREATIONAL -> {
                    returnedActivity = RECREATIONAL;
                    break;
                }
                case Constants.CHOSEN_ACTIVITY_SPORTS, Constants.USER_CHOSEN_ACTIVITY_SPORTS ->  {
                    returnedActivity = SPORTS;
                    break;
                }
                case Constants.IRRELEVANT, Constants.USER_IRRELEVANT -> {
                    returnedActivity = IRRELEVANT;
                    break;
                }

                default -> {
                    returnedActivity = UNDEFINED;
                    break;
                }
            }
            return returnedActivity;
        }
    }

    public enum Budget
    {
        REDUCED,
        MEDIUM,
        LARGE,
        UNDEFINED;

        public static Budget convertFromStringToBudget(String budget)
        {
            Budget returnedBudget = UNDEFINED;
            switch (budget){
                case Constants.CHOSEN_BUDGET_REDUCED -> returnedBudget = REDUCED;
                case Constants.CHOSEN_BUDGET_MEDIUM -> returnedBudget = MEDIUM;
                case Constants.CHOSEN_BUDGET_LARGE -> returnedBudget = LARGE;
            }
            return returnedBudget;
        }

        public static Budget convertFromStringToBudgetUser(String budget){
            Budget returnedBudget = UNDEFINED;

            if( Integer.parseInt(budget) <= Integer.parseInt(Constants.SET_BUDGET_REDUCED))
                returnedBudget = REDUCED;
            if( (Integer.parseInt(budget) > Integer.parseInt(Constants.SET_BUDGET_REDUCED))
                && (Integer.parseInt(budget) <= Integer.parseInt(Constants.SET_BUDGET_MEDIUM))
                || (Integer.parseInt(budget) > Integer.parseInt(Constants.SET_BUDGET_MEDIUM))
                    && (Integer.parseInt(budget) <= Integer.parseInt(Constants.SET_BUDGET_LARGE)))
                returnedBudget = MEDIUM;
            if( Integer.parseInt(budget) > Integer.parseInt(Constants.SET_BUDGET_LARGE))
                returnedBudget = LARGE;

            return returnedBudget;
        }
    }

    public enum Locations
    {
        COUNTRY,
        EUROPE,
        GLOBAL,
        UNDEFINED;

        public static Locations convertFromStringToBudget(String location)
        {
            Locations returnedBudget;
            switch (location)
            {
                case Constants.CHOSEN_LOCATION_COUNTRY, Constants.USER_CHOSEN_LOCATION_COUNTRY -> {
                    returnedBudget =  COUNTRY;
                    break;
                }
                case Constants.CHOSEN_LOCATION_EUROPE, Constants.USER_CHOSEN_LOCATION_EUROPE -> {
                    returnedBudget = EUROPE;
                    break;
                }
                case Constants.CHOSEN_LOCATION_GLOBAL, Constants.USER_CHOSEN_LOCATION_GLOBAL ->  {
                    returnedBudget = GLOBAL;
                    break;
                }

                default -> {
                    returnedBudget = UNDEFINED;
                    break;
                }
            }
            return returnedBudget;
        }
    }

}

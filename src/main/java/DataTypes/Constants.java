package DataTypes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Constants {

    public static final boolean TRUE = true;
    public static final boolean FALSE = false;

    //strings constants
    public static final String EMPTY = "";
    public static final String NEW_LINE = "\n";
    public static final String OFFERS = "offers";
    public static final String LINE_SEPARATOR= ":";
    public static final String SPACE = " ";

    //Path to database
    public static final Path DATABASE_PATH = Paths.get(System.getProperty("user.dir"),"src","main","resources","Database", "dataTest.json");

    // Vacation class fields
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String AGE = "age";
    public static final String TEMPERATURE = "temperature";
    public static final String ACTIVITY = "activity";
    public static final String BUDGET = "budget";
    public static final String LOCATION = "location";

    //User input values
    public static final String CHOSEN_AGE_YOUNG = "18 - 35";
    public static final String CHOSEN_AGE_MIDDLE = "36 - 50";
    public static final String CHOSEN_AGE_OLD = "51+";
    public static final String CHOSEN_TEMPERATURE_COLD = "COLD" ;
    public static final String CHOSEN_TEMPERATURE_TEMPERATE= "TEMPERATE";
    public static final String CHOSEN_TEMPERATURE_WARM = "WARM";
    public static final String CHOSEN_ACTIVITY_RELAXING = "RELAXING";
    public static final String CHOSEN_ACTIVITY_RECREATIONAL = "RECREATIONAL";
    public static final String CHOSEN_ACTIVITY_SPORTS = "SPORTS";
    public static final String SET_BUDGET_REDUCED = "1300";
    public static final String SET_BUDGET_MEDIUM = "3500";
    public static final String SET_BUDGET_LARGE = "8000";
    public static final String CHOSEN_LOCATION_COUNTRY = "Inside the country";
    public static final String CHOSEN_LOCATION_EUROPE = "Inside Europe";
    public static final String CHOSEN_LOCATION_GLOBAL = "Everywhere in the world";
    public static final String IRRELEVANT = "IRRELEVANT";

    //Value assignement
    public static final Double MAX_VALUE = 1.00;
    public static final Double MIN_VALUE = 0.00;
}

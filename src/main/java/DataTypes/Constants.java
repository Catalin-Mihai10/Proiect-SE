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
    public static final Path DATABASE_PATH =
            Paths.get(System.getProperty("user.dir"),"src","main","resources","Database", "BazaCunostiinte_final.json");

    // Vacation class fields
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String AGE = "age";
    public static final String TEMPERATURE = "temperature";
    public static final String ACTIVITY = "activity";
    public static final String BUDGET = "budget";
    public static final String LOCATION = "location";

    //User input values
    public static final String USER_CHOSEN_AGE_YOUNG = "18 - 35";
    public static final String USER_CHOSEN_AGE_MIDDLE = "36 - 50";
    public static final String USER_CHOSEN_AGE_OLD = "51+";
    public static final String CHOSEN_YOUNG = "1";
    public static final String CHOSEN_MIDDLE = "2";
    public static final String CHOSEN_OLD = "3";
    public static final String CHOSEN_YOUNG_MIDDLE = "1/2";
    public static final String CHOSEN_YOUNG_OLD = "1/3";
    public static final String CHOSEN_YOUNG_MIDDLE_OLD = "1/2/3";
    public static final String CHOSEN_MIDDLE_OLD = "2/3";
    public static final String CHOSEN_TEMPERATURE_COLD = "rece" ;
    public static final String CHOSEN_TEMPERATURE_TEMPERATE= "temperat";
    public static final String CHOSEN_TEMPERATURE_WARM = "cald";
    public static final String USER_CHOSEN_TEMPERATURE_COLD = "Cold" ;
    public static final String USER_CHOSEN_TEMPERATURE_TEMPERATE= "Temperate";
    public static final String USER_CHOSEN_TEMPERATURE_WARM = "Warm";
    public static final String CHOSEN_ACTIVITY_RELAXING = "relaxant";
    public static final String CHOSEN_ACTIVITY_RECREATIONAL = "recreativ";
    public static final String CHOSEN_ACTIVITY_SPORTS = "sportiv";
    public static final String USER_CHOSEN_ACTIVITY_SPORTS = "Sport";
    public static final String USER_CHOSEN_ACTIVITY_RELAXING = "Relaxing";
    public static final String USER_CHOSEN_ACTIVITY_RECREATIONAL = "Recreational";
    public static final String SET_BUDGET_REDUCED = "1300";
    public static final String SET_BUDGET_MEDIUM = "3500";
    public static final String SET_BUDGET_LARGE = "8000";
    public static final String CHOSEN_BUDGET_REDUCED = "mic";
    public static final String CHOSEN_BUDGET_MEDIUM = "mediu";
    public static final String CHOSEN_BUDGET_LARGE = "mare";
    public static final String CHOSEN_LOCATION_COUNTRY = "aproape";
    public static final String CHOSEN_LOCATION_EUROPE = "europa";
    public static final String CHOSEN_LOCATION_GLOBAL = "global";
    public static final String USER_CHOSEN_LOCATION_COUNTRY = "Inside the country";
    public static final String USER_CHOSEN_LOCATION_EUROPE = "Inside Europe";
    public static final String USER_CHOSEN_LOCATION_GLOBAL = "Everywhere in the world";
    public static final String IRRELEVANT = "irelevant";
    public static final String USER_IRRELEVANT = "Irrelevant";

    //Value assignement
    public static final Double MAX_VALUE = 1.00;
    public static final Double MIN_VALUE = 0.00;
}

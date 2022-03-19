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
}

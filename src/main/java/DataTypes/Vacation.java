package DataTypes;

public class Vacation {
    private String name;
    private String description;
    private Enums.Age age;
    private Enums.Temperature temperature;
    private Enums.Activities activity;
    private Enums.Budget budget;
    private Enums.Locations location;

    public Vacation(){}

    public Vacation(
            String name,
            String description,
            Enums.Age ageRange,
            Enums.Temperature temperature,
            Enums.Activities activity,
            Enums.Budget budget,
            Enums.Locations location)
    {
        setName(name);
        setDescription(description);
        setAge(ageRange);
        setTemperature(temperature);
        setActivity(activity);
        setBudget(budget);
        setLocation(location);
    }

    public Vacation(Vacation vacation)
    {
        setName(vacation.getName());
        setDescription(vacation.getDescription());
        setAge(vacation.getAge());
        setTemperature(vacation.getTemperature());
        setActivity(vacation.getActivity());
        setBudget(vacation.getBudget());
        setLocation(vacation.getLocation());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {return description;}

    public Enums.Age getAge() {
        return age;
    }

    public Enums.Temperature getTemperature() {
        return temperature;
    }

    public Enums.Activities getActivity() {
        return activity;
    }

    public Enums.Budget getBudget() {
        return budget;
    }

    public Enums.Locations getLocation() {
        return location;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setAge(Enums.Age age){
        this.age = age;
    }

    public void setTemperature(Enums.Temperature temperature){
        this.temperature = temperature;
    }

    public void setActivity(Enums.Activities activity){
        this.activity = activity;
    }

    public void setBudget(Enums.Budget budget){
        this.budget = budget;
    }

    public void setLocation(Enums.Locations location){
        this.location = location;
    }

    public String toString(){
        String vacationString = Constants.EMPTY;

        vacationString += Constants.NEW_LINE + Constants.NAME + Constants.LINE_SEPARATOR + Constants.SPACE + getName() + Constants.NEW_LINE +
                Constants.DESCRIPTION + Constants.LINE_SEPARATOR + Constants.SPACE + getDescription() + Constants.NEW_LINE +
                Constants.ACTIVITY + Constants.LINE_SEPARATOR + Constants.SPACE + getActivity() + Constants.NEW_LINE +
                Constants.AGE + Constants.LINE_SEPARATOR + Constants.SPACE + getAge() + Constants.NEW_LINE +
                Constants.TEMPERATURE + Constants.LINE_SEPARATOR + Constants.SPACE + getTemperature() + Constants.NEW_LINE +
                Constants.BUDGET + Constants.LINE_SEPARATOR + Constants.SPACE + getBudget() + Constants.NEW_LINE +
                Constants.LOCATION + Constants.LINE_SEPARATOR + Constants.SPACE + getLocation() + Constants.NEW_LINE;

        return vacationString;
    }
}

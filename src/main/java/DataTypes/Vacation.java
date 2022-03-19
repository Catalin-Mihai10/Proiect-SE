package DataTypes;

public class Vacation {
    private String name;
    private String description;
    private int age;
    private Enums.Temperature temperature;
    private Enums.Activities activity;
    private Enums.Budget budget;
    private Enums.Locations location;

    public Vacation(
            String name,
            String description,
            int ageRange,
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

    public String getName() {
        return name;
    }

    public String getDescription() {return description;}

    public int getAge() {
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

    public void setAge(int age){
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
}

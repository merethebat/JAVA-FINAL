package model;

public class WorkoutClass {
    private int id;
    private String name;
    private String description;

    public WorkoutClass(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
}
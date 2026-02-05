package model;

import java.time.LocalDate;

public class Habit { // is used to create a habit unit
    // setters, getters and habit's main data
    private final long id;
    private String name;
    private FrequencyType frequencyType;
    private LocalDate startDate;

    public Habit(long id, String name, FrequencyType frequencyType, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.frequencyType = frequencyType;
        this.startDate = startDate;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public FrequencyType getFrequency(){
        return frequencyType;
    }
}



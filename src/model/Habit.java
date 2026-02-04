package model;

import java.time.LocalDate;

public class Habit { // is used to create a habit unit
    // setters, getters and habit's main data
    private final long id;
    private String name;
    private Frequency frequency;
    private LocalDate startDate;

    public Habit(long id, String name, Frequency  frequency, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
        this.startDate = startDate;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Frequency getFrequency(){
        return frequency;
    }
}



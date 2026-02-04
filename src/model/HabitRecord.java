package model;

import java.time.LocalDate;

public class HabitRecord { // is used for habit checking
    // habit id, status and date
    // it is easier to use ID because it will prevent unnecessary copies of the object
    private long habitId;
    private LocalDate date;
    private boolean done;

    public LocalDate getDate() {
        return date;
    }

    public boolean isDone(){
        return done;
    }
}

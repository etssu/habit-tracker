package service;

import model.Habit;
import model.HabitRecord;

import java.time.LocalDate;
import java.util.List;

public class StreakCalculator {
    private LocalDate currentDate = LocalDate.now();

    public int calculateStreakPerHabit(Habit habit) {
        List<HabitRecord> records;

        for(HabitRecord habitRecord : records) {
            if (habitRecord.getDate() == currentDate && habitRecord.isDone()) {
                habitStreak += 1;
            }
        }
        return habitStreak;
    }
}

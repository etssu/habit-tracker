package service;

import model.FrequencyType;
import model.Habit;
import model.HabitRecord;
import storage.InMemoryHabitRecordStorage;

import java.time.LocalDate;
import java.util.List;

public class StreakCalculator {
    // private LocalDate today = LocalDate.now();

    public int calculateStreakPerHabit(Habit habit, FrequencyType frequencyType) {
        InMemoryHabitRecordStorage storage = new InMemoryHabitRecordStorage(); // create a storage
        List<HabitRecord> records = storage.getRecordsByHabitId(habit.getId()); // get habit's records
        int doneCount = 0;

        if (frequencyType == FrequencyType.DAILY) {
            for (HabitRecord record : records) {
                LocalDate recordDate = record.getDate();
                /* if the habit wasn't done today - return 0
                * if it was done, then go to the day before and check it
                * count until the day when it wasn't done
                * the return value is doneCount */
            }
        }
        if (frequencyType == FrequencyType.TWO_PER_WEEK) {
            /* (1 period is 2 days per week)
            * create 2 variables: weekStart and weekEnd.
            * if doneCount >= 2 between weekStart and weekEnd -> streak++
            * so we're checking the whole week and then move 1 week behind
            * else: return 0*/

        }

        return 0;
    }
}

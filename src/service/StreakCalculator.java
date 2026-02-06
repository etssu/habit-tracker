package service;

import model.FrequencyType;
import model.Habit;
import model.HabitRecord;
import storage.InMemoryHabitRecordStorage;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class StreakCalculator {
    // private LocalDate today = LocalDate.now();

    public int calculateStreakPerHabit(Habit habit, FrequencyType frequencyType) {
        InMemoryHabitRecordStorage storage = new InMemoryHabitRecordStorage(); // create a storage
        List<HabitRecord> records = storage.getRecordsByHabitId(habit.getId()); // get habit's records
        int doneCount = 0;

        if (frequencyType == FrequencyType.DAILY) {
            LocalDate date = LocalDate.now();

            while (true) { // outer loop to manipulate the days
                boolean doneThatDay = false;

                for (HabitRecord record : records) { // inner loop to manipulate records
                    if (record.getDate().isEqual(date) && record.isDone()) {
                        doneThatDay = true;
                        break;
                    }
                }

                if (doneThatDay) {
                    doneCount++;
                    date = date.minusDays(1);
                } else {
                    break;
                }
            }
            return doneCount;
        }
        if (frequencyType == FrequencyType.TWO_PER_WEEK) {
            LocalDate weekStart = today.with(DayOfWeek.MONDAY);
            LocalDate weekEnd = today.with(DayOfWeek.SUNDAY);
            /* (1 period is 2 days per week)
            * create 2 variables: weekStart and weekEnd.
            * if doneCount >= 2 between weekStart and weekEnd -> streak++
            * so we're checking the whole week and then move 1 week behind
            * else: return 0*/

        }

        return 0;
    }
}

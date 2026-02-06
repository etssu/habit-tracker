package service;

import model.FrequencyType;
import model.Habit;
import model.HabitRecord;
import storage.InMemoryHabitRecordStorage;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class StreakCalculator {

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

        /* (1 period is X days per week)
         * create 2 variables: weekStart and weekEnd.
         * if doneCount >= X between weekStart and weekEnd -> streak++
         * so we're checking the whole week and then move 1 week behind
         * else: return 0*/
        if (frequencyType == FrequencyType.TWO_PER_WEEK) {}
        if (frequencyType == FrequencyType.THREE_PER_WEEK) {}
        if (frequencyType == FrequencyType.FOUR_PER_WEEK) {}
        if (frequencyType == FrequencyType.FIVE_PER_WEEK) {}
        if (frequencyType == FrequencyType.SIX_PER_WEEK) {}

        return 0;
    }
}

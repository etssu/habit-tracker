package storage;

import model.Habit;

import java.util.List;

public interface HabitStorage {
    List<Habit> getHabits();
    void addHabit(Habit habit);
    void deleteHabit(int habitId);
}

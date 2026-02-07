package storage;

import model.Habit;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHabitStorage {
    List<Habit> habits = new ArrayList<Habit>();

    public List<Habit> getHabits() {
        return new ArrayList<>(habits); // returning the copy
    }

    public void createHabit(Habit habit) {
        habits.add(habit);
    }

    public void deleteHabit(long habitId) {
        habits.removeIf(h -> h.getId() == habitId);
    }
}

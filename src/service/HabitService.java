package service;

import model.Frequency;
import model.Habit;
import storage.InMemoryHabitStorage;

import java.util.List;

public class HabitService {
    // is used for creating/deleting/editing the habit
    InMemoryHabitStorage storage  = new InMemoryHabitStorage();
    public void createHabit(String habitName, String frequencyInput){
        Frequency frequency;

        try {
            frequency = Frequency.fromString(frequencyInput);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid frequency format");
        }

        // Habit habit = new Habit(habitName, frequency);
        // storage.createHabit(habit);
    }
    public void deleteHabit() {
        // TODO implement
    }
    public List<Habit> getAllHabits() {
        // TODO implement
        return null; // for compilation
    }
}

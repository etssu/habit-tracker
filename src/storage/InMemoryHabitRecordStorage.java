package storage;

import model.HabitRecord;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHabitRecordStorage implements HabitRecordStorage {
    private List<HabitRecord> records =  new ArrayList<>();

    public List<HabitRecord> getRecordsByHabitId(long habitId) {
        return records.stream()
                .filter(r -> r.getHabitId() == habitId)
                .toList();
    }

    public void saveRecord(HabitRecord record) {
        records.add(record);
    }
}

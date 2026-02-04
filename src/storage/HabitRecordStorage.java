package storage;

import model.HabitRecord;

import java.util.List;

public interface HabitRecordStorage {
    List<HabitRecord> getRecordsByHabitId(long habitId);
    void saveRecord(HabitRecord record);
}

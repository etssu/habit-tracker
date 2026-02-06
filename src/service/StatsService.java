package service;

public class StatsService { // is used for statistics (streaks etc.)
    private int currentStreak;
    private int longestStreak;

    int getCurrentStreak() {
        return currentStreak;
    }

    int getLongestStreak() {
        return longestStreak;
    }
}

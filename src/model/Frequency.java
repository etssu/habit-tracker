package model;

public class Frequency {
    FrequencyType frequencyType;
    private final int timesPerWeek;

    private Frequency(int timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public static Frequency fromString(String input) {
        if (input.equalsIgnoreCase("daily")) {
            return new Frequency(7);
        }

        try {
            int x = Integer.parseInt(input);
            if (x <= 0 || x > 7) {
                throw new IllegalArgumentException();
            }
            return new Frequency(x);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid frequency.");
        }
    }
}

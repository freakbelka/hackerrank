package algorithms;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfProgrammer {

    public static final int TRANSITION_YEAR = 1918;

    public static final int PD_TRANSITION = 26;
    public static final int PD_LEAP = 12;
    public static final int PD_NORMAL = 13;

    private static String getDateString(int day, int year) {
        return String.format("%d.09.%d", day, year);
    }

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if (year == TRANSITION_YEAR) return getDateString(PD_TRANSITION, year); // transition year

        // Julian calendar
        if ((year < TRANSITION_YEAR &&
                // leap year definition in the Julian calendar
                year % 4 == 0)
                // Gregorian calendar
                || (year > TRANSITION_YEAR &&
                // leap year definition in the Gregorian calendar
                (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
            return getDateString(PD_LEAP, year);
        } else {
            return getDateString(PD_NORMAL, year);
        }
    }
}

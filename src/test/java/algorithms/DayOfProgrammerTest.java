package algorithms;

import org.junit.jupiter.api.Test;

import static algorithms.DayOfProgrammer.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfProgrammerTest {
    public static final String DATE_STRING_FORMAT = "%d.09.%d";

    @Test
    public void dayOfProgrammer_julianCalendarLeapYear() {
        assertEquals(dayOfProgrammer(1800), String.format(DATE_STRING_FORMAT, PD_LEAP, 1800));
    }

    @Test
    public void dayOfProgrammer_julianCalendarLeapYearNotMultipleOf100() {
        assertEquals(dayOfProgrammer(1704), String.format(DATE_STRING_FORMAT, PD_LEAP, 1704));
    }


    @Test
    public void dayOfProgrammer_julianCalendarNormalYearNearTransition() {
        assertEquals(dayOfProgrammer(1917), String.format(DATE_STRING_FORMAT, PD_NORMAL, 1917));
    }

    @Test
    public void dayOfProgrammer_julianCalendarNormalYear() {
        assertEquals(dayOfProgrammer(1705), String.format(DATE_STRING_FORMAT, PD_NORMAL, 1705));
    }

    @Test
    public void dayOfProgrammer_gregorianCalendarLeapYearMultipleOf4() {
        assertEquals(dayOfProgrammer(2016), String.format(DATE_STRING_FORMAT, PD_LEAP, 2016));
    }

    @Test
    public void dayOfProgrammer_gregorianCalendarNormalYear() {
        assertEquals(dayOfProgrammer(2017), String.format(DATE_STRING_FORMAT, PD_NORMAL, 2017));
    }

    @Test
    public void dayOfProgrammer_gregorianCalendarNormalYearMultipleOf4And100() {
        assertEquals(dayOfProgrammer(2500), String.format(DATE_STRING_FORMAT, PD_NORMAL, 2500));
    }

    @Test
    public void dayOfProgrammer_gregorianCalendarNormalYearNearTransition() {
        assertEquals(dayOfProgrammer(1919), String.format(DATE_STRING_FORMAT, PD_NORMAL, 1919));
    }

    @Test
    public void dayOfProgrammer_transitionYear() {
        assertEquals(dayOfProgrammer(1918), String.format(DATE_STRING_FORMAT, PD_TRANSITION, 1918));
    }
}
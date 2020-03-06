package test;

import main.LeapYear;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UnitTest {
    private static final LeapYear LeapYear = new LeapYear();
    public int year = 1900;

    @Test
    public void should_return_leap_year_if_divisible_by_400(){
        assertThat(LeapYear.LeapYear(year), equalTo("LeapYear"));
    }

    @Test
    public void should_return_not_leap_year_by_100_and_400(){
        assertThat(LeapYear.LeapYear(year), equalTo("not leap by 100 and 400"));
    }
}

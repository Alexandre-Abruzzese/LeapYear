package test;

import main.LeapYear;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class UnitTest {
    private static final LeapYear LeapYear = new LeapYear();
    public int year = 2020;

    @Test
    public void should_return_leap_year_if_divisible_by_400(){
        assertThat(LeapYear.LeapYear(year), equalTo("LeapYear"));
    }
}

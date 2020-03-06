package main;

public class LeapYear {
    public String LeapYear(int year)
    {
        if (year%400 == 0)
        {
            return "LeapYear";
        }
        return "";
    }
}

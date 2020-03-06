package main;

//class who calcul a leap year

public class LeapYear {
    public String LeapYear(int year)
    {
        if (year%400 == 0)
        {
            return "LeapYear";
        }
        else if (year%100 == 0 && year%400 != 0)
        {
            return "not leap by 100 and 400";
        }
        return "";
    }
}

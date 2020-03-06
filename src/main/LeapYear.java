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
        else if (year%4 == 0 && year%100 != 0)
        {
            return "not leap by 4 and 100";
        }
        return "";
    }
}

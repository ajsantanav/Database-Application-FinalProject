package edu.citytech.cst.s23370098.dto;

public class ShortDate
{
    private int year;
    private int month;
    private int day;
    private String dayName;

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public ShortDate(int year, int month, int day, String dayName) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayName = dayName;
    }

    public int getMonth ()
    {
        return month;
    }

    public void setMonth (int month)
    {
        this.month = month;
    }

    public int getYear ()
    {
        return year;
    }

    public void setYear (int year)
    {
        this.year = year;
    }

    public int getDay ()
    {
        return day;
    }

    public void setDay (int day)
    {
        this.day = day;
    }


    @Override
    public String toString() {
        return "ShortDate{" +
                "month=" + month +
                ", year=" + year +
                ", day=" + day +
                ", dayName='" + dayName + '\'' +
                '}';
    }

}
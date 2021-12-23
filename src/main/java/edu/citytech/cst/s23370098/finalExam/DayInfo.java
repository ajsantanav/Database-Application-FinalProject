package edu.citytech.cst.s23370098.finalExam;

import java.util.ArrayList;

public class DayInfo {
    private float total;

    private int dayNumber;

    private String day;

    public float getTotal ()
    {
        return total;
    }

    public void setTotal (float total)
    {
        this.total = total;
    }

    public int getDayNumber ()
    {
        return dayNumber;
    }

    public void setDayNumber (int dayNumber)
    {
        this.dayNumber = dayNumber;
    }

    public String getDay ()
    {
        return day;
    }

    public void setDay (String day)
    {
        this.day = day;
    }

    @Override
    public String toString() {
        return "DayInfo{" +
                "total=" + total +
                ", dayNumber=" + dayNumber +
                ", day='" + day + '\'' +
                '}';
    }
}
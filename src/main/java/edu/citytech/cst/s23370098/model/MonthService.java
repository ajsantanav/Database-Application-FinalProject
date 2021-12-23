package edu.citytech.cst.s23370098.model;

public class MonthService {
    public static String getMonth(int month) {
        var monthName = "January";
        if(month == 2)
        {
            monthName = "February";
        }
        else if(month == 3)
        {
            monthName = "March";
        }
        else if(month == 4)
        {
            monthName = "April";
        }
        else if(month == 5)
        {
            monthName = "May";
        }
        else if(month == 6)
        {
            monthName = "June";
        }
        else if(month == 7)
        {
            monthName = "July";
        }
        else if(month == 8)
        {
            monthName = "August";
        }
        else if(month == 9)
        {
            monthName = "September";
        }
        else if(month == 10)
        {
            monthName = "Oct";
        }
        else if(month == 11)
        {
            monthName = "Nov";
        }
        else if(month == 12)
        {
            monthName = "Dec";
        }
        return monthName;
    }
}

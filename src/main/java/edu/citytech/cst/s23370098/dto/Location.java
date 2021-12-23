package edu.citytech.cst.s23370098.dto;

import java.util.Arrays;

public class Location
{
    private String code;

    private String[] point;

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String[] getPoint ()
    {
        return point;
    }

    public void setPoint (String[] point)
    {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Location{" +
                "code='" + code + '\'' +
                ", point=" + Arrays.toString(point) +
                '}';
    }

}
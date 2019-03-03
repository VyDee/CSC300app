package com.example.admin.csc300basketballplayer;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

//Serializable needed by Firebase - means this class can be converted to JSON
public class BasketballRecord implements Serializable
{
    //Fields
    public String name;
    public int jNum;
    public int age;
    public int height_ft;
    public int height_in;


    //Constructor
    public BasketballRecord(String name, int jNum, int age, int height_ft, int height_in)
    {
        this.name = name;
        this.jNum = jNum;
        this.age = age;
        this.height_ft = height_ft;
        this.height_in = height_in;
    }
    public BasketballRecord()
    {
        this. name = "name";
        this.age = 0;
        this.jNum =0;
        this.height_ft = 0;
        this.height_in = 0;
    }

    @Exclude
    public void display()
    {
        //System.out.format("%s (%d) has Jersey number %d - height %f feet (%f inches).",this.name, this.age,this.jNum,this.height_ft,this.height_in);
        System.out.println(this.name + " (" + this.age +") has Jersey number " + this.jNum + " - height " + this.height_ft + " feet (" + this.height_ft*12 +" inches).");
    }

    @Exclude
    public String getNameString()
    {
        return this.name + "";
    }

    @Exclude
    public String getAgeString()
    {
        return "Age: " + this.age;
    }

    @Exclude
    public String getJNumString()
    {
        return "Jersey number: " + this.jNum;
    }

    @Exclude
    public String getHeight_ftString()
    {
        return "Height: " + this.height_ft + " feet";
    }

    @Exclude
    public String getHeight_inString()
    {
        return "Height: " + this.height_in + " inches";}

    @Exclude
    public int getjNum()
    {
        return this.jNum;
    }

    @Exclude
    public String getName()
    {
        return name;
    }

    @Exclude
    public int getAge()
    {
        return age;
    }

    @Exclude
    public int getHeight_ft()
    {
        return height_ft;
    }

    @Exclude
    public String toString()
    {
        return this.name +" ("+ this.age +") has jersey number "+ this.jNum + " - "+ this.height_ft +" feet "+ this.height_in +" inches.";
    }


    @Exclude
    public int getHeight_in()
    {
        return height_in;
    }
}
package com.example.admin.csc300basketballplayer;

import java.io.Serializable;

public class BasketballRecord implements Serializable
{
    //Fields
    private String name;
    private int jNum;
    private int age;
    private int height_ft;
    private int height_in;

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

    public void display()
    {
        //System.out.format("%s (%d) has Jersey number %d - height %f feet (%f inches).",this.name, this.age,this.jNum,this.height_ft,this.height_in);
        System.out.println(this.name + " (" + this.age +") has Jersey number " + this.jNum + " - height " + this.height_ft + " feet (" + this.height_ft*12 +" inches).");
    }

    public String getNameString()
    {
        return this.name + "";
    }
    public String getAgeString()
    {
        return "Age: " + this.age;
    }
    public String getJNumString()
    {
        return "Jersey number: " + this.jNum;
    }
    public String getHeight_ftString()
    {
        return "Height: " + this.height_ft + " feet";
    }
    public String getHeight_inString()
    {
        return "Height: " + this.height_in + " inches";}


    public int getjNum()
    {
        return this.jNum;
    }


    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getHeight_ft()
    {
        return height_ft;
    }

    /*public String toString()
    {
        return this.name +" ("+ this.age +") has jersey number "+ this.jNum + " - "+ this.height_ft +" feet "+ this.height_in +" inches.";
    }*/



    public int getHeight_in()
    {
        return height_in;
    }
}

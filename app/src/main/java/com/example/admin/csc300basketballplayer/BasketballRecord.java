package com.example.admin.csc300basketballplayer;

public class BasketballRecord
{
    //Fields
    private String name;
    private int jNum;
    private int age;
    private float height_ft;
    private float height_in;

    public BasketballRecord(String name, int jNum, int age, float height_ft, float height_in)
    {
        this.name = name;
        this.jNum = jNum;
        this.age = age;
        this.height_ft = height_ft;
        this.height_in = height_in;
    }

    public void display()
    {
        //System.out.format("%s (%d) has Jersey number %d - height %f feet (%f inches).",this.name, this.age,this.jNum,this.height_ft,this.height_in);
        System.out.println(this.name + " (" + this.age +") has Jersey number " + this.jNum + " - height " + this.height_ft + " feet (" + this.height_ft*12 +" inches).");
    }
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

    public float getHeight_ft()
    {
        return height_ft;
    }

    public float getHeight_in()
    {
        return height_in;
    }
}

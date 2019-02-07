package com.example.admin.csc300basketballplayer;

public class Core
{
    private static BasketballRecord[] basketballPlayer = new BasketballRecord[1000];
    private static int numberOfPlayer = 0;

    public static String[] playerName = new String[1000];
    public static int numberOfList =0;


    public static void addBasketballPlayer(BasketballRecord br)
    {

        //encapsulated the logic of adding player records here
        Core.basketballPlayer[numberOfPlayer]=br;
        numberOfPlayer++;
    }

    public static void showPlayer (BasketballRecord br)
    {
        String name = br.getName();
        String age = Integer.toString(br.getAge());
        String jNum = Integer.toString(br.getjNum());
        String height_ft = Integer.toString(br.getHeight_ft());
        String height_in = Integer.toString(br.getHeight_in());
        Core.playerName[numberOfList]= name +" ("+ age +") has jersey number "+ jNum + " - "+ height_ft +" feet "+ height_in +" inches.";
        //Core.playerName[numberOfList]= name;
        numberOfList++;
    }
}

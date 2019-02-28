package com.example.admin.csc300basketballplayer;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Core
{
    public static BasketballRecord[] basketballPlayer = new BasketballRecord[1000];
    private static int numberOfPlayer = 0;

    public static String[] playerName = new String[1000];
    public static int numberOfList =0;

    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = database.getReference("basketballPlayers");

    public static void listenForDatabaseChanges()
    {
        //async listener
        ValueEventListener prListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                //Get Post object and use the values to update the UI
                System.out.println(dataSnapshot);
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    BasketballRecord br = ds.getValue(BasketballRecord.class);
                    System.out.println("***** Data Changed");
                    br.display();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                // Getting Post failed, log a message
                System.out.println("loadPost:onCancelled" + databaseError.toException());
            }
        };
        Core.myRef.addValueEventListener(prListener);
    }

    public static void writePlayerRecordToFirebase(BasketballRecord br)
    {
        //static context
        Core.myRef.push().setValue(br);
    }


    public static void addBasketballPlayer(BasketballRecord br)
    {

        //encapsulated the logic of adding player records here
        Core.basketballPlayer[Core.numberOfPlayer]=br;
        Core.playerName[Core.numberOfPlayer] = br.toString();
        Core.numberOfPlayer++;
        Core.writePlayerRecordToFirebase(br);

    }

   public static void showPlayer (BasketballRecord br)
    {
        String name = br.getName();
        String age = Integer.toString(br.getAge());
        String jNum = Integer.toString(br.getjNum());
        String height_ft = Integer.toString(br.getHeight_ft());
        String height_in = Integer.toString(br.getHeight_in());
        Core.playerName[numberOfList]= name +" ("+ age +") has jersey number "+ jNum + " - "+ height_ft +
                " feet "+ height_in +" inches.";
        //Core.playerName[numberOfList]= name;
        //Core.playerName[Core.numberOfPlayer] = br.toString();
        numberOfList++;
    }
}

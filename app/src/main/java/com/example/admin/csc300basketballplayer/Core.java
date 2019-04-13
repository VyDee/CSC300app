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
    public static BasketballRecord[] basketballPlayer = new BasketballRecord[0];
    public static String[] playerName = new String[1000];
    private static int numberOfPlayer = 0;
    private static FirebaseDatabase database;
    public static DatabaseReference myRef;

    public static BasketballPlayerAdapter aa;

    public static void initializeDatabase()
    {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("players");
    }

    public static void listenForDatabaseChanges()
    {
        //async listener
        ValueEventListener prListener = new ValueEventListener() {
            @Override

            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                //Get Post object and use the values to update the UI
                System.out.println(dataSnapshot);

                //goes through each json object contained within
                //the top level datasnapshot and turns it back
                //into a BasketballPlayerRecord

                Core.numberOfPlayer = 0;

                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    BasketballRecord br = ds.getValue(BasketballRecord.class);
                    //System.out.println("***** Data Changed");
                    Core.addBasketballPlayerLocal(br);


                }
                Core.aa.notifyDataSetChanged();
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

    public static void addBasketballPlayerLocal (BasketballRecord br)
    {
        //encapsulated the logic of adding player records here
        Core.basketballPlayer[Core.numberOfPlayer]=br;
        Core.playerName[Core.numberOfPlayer] = br.toString();
        Core.numberOfPlayer++;
    }

    public static void addBasketballPlayer(BasketballRecord br)
    {
        Core.writePlayerRecordToFirebase(br);
    }















}
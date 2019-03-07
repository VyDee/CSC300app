package com.example.admin.csc300basketballplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
{


    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        System.out.println("*** Linked List Test");
        LinkedList ll = new LinkedList();
        ll.addEnd(7);
        ll.addEnd(2);
        ll.display();

        // initializes the array of Strings so there are place holder strings in there
        for (int i = 0; i < Core.basketballPlayer.length; i++)
        {
           // Core.basketballPlayer[i] = new BasketballRecord();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Core.aa = new BasketballPlayerAdapter(this, R.layout.list_view_row_advanced,
                Core.basketballPlayer);
        this.lv = (ListView)this.findViewById(R.id.listView);
        this.lv.setAdapter(Core.aa);

        //Start Listening for changes to the database
        Core.listenForDatabaseChanges(); // non-blocking!!!

    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("****** ON START!!!!!!");

    }
    @Override
    protected void onRestart()
    {

        super.onRestart();
        System.out.println("OnRESTART");
        Core.aa.notifyDataSetChanged();

    }
    public void onAddPlayerPressed(View v)
    {
        Intent i = new Intent(this,BasketballRecordAddNewActivity.class);
        this.startActivity(i);
    }

}
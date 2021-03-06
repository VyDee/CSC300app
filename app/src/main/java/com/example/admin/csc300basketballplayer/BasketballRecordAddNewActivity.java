package com.example.admin.csc300basketballplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasketballRecordAddNewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_record_add_new);
    }


    public void addNewBasketball(View v)
    {
        EditText nameET = (EditText)this.findViewById(R.id.nameET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);
        EditText jNumET = (EditText)this.findViewById(R.id.jNumET);
        EditText  height_ftET = (EditText) this.findViewById(R.id.height_ftET);
        EditText height_inET = (EditText) this.findViewById(R.id.height_inET);

        String name = nameET.getText().toString();
        int jNum = Integer.parseInt(jNumET.getText().toString());
        int age = Integer.parseInt(ageET.getText().toString());
        int height_ft =Integer.parseInt(height_ftET.getText().toString());
        int height_in =Integer.parseInt(height_inET.getText().toString());

        BasketballRecord br = new BasketballRecord(name,jNum,age,height_ft,height_in);

        Core.addBasketballPlayer(br);

        this.finish();


    }

}

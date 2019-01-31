package com.example.admin.csc300basketballplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

        BasketballRecord br = new BasketballRecord(nameET.getText().toString(),Integer.parseInt(jNumET.getText().toString()),
                Integer.parseInt(ageET.getText().toString()),Float.parseFloat(height_ftET.getText().toString()),Float.parseFloat(height_inET.getText().toString()));

        br.display();

    }
}

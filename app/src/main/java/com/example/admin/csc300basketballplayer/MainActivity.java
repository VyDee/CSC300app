package com.example.admin.csc300basketballplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    public static ArrayList<String> listPlayers = new ArrayList<String>();

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






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

        //String[] temp = new String[1000];
        //temp[Core.numberOfList-1]=Core.playerName[Core.numberOfList-1];

        System.out.println(Core.playerName[Core.numberOfList-1]);

        /*List<String> playerList = new ArrayList<>(Arrays.asList(temp));

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_view_row,playerList );
        ListView lv = (ListView)this.findViewById(R.id.listView);

        lv.setAdapter(aa);

        lv.invalidateViews();*/

        /*BasketballRecord[] playerList = Core.basketballPlayer;
        System.out.println( playerList[0]);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_view_row,temp);
        ListView lv = (ListView)this.findViewById(R.id.listView);
        lv.setAdapter(aa);
        //lv.invalidateViews();*/

        ListView lv = (ListView) this.findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_view_row,listPlayers);
        lv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        lv.invalidate();

    }
    public void onAddPlayerPressed(View v)
    {
        Intent i = new Intent(this,BasketballRecordAddNewActivity.class);
        this.startActivity(i);
    }




}

package com.example.admin.csc300basketballplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class BasketballPlayerAdapter extends ArrayAdapter
{
    private Context mContext;
    private BasketballRecord[] basketballRecordList = new BasketballRecord[1000];
    private int textViewResourceId;

    public BasketballPlayerAdapter(Context context, int textViewResourceId, BasketballRecord[] list)
    {
        //call my parent's constructor - MUST BE FIRST LINE
        super(context,textViewResourceId,list);
        this.mContext = context;
        this.basketballRecordList = list;
        this.textViewResourceId = textViewResourceId;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        // android will re-use existing rows for performance reasons
        // this checks to see if the convertView is already a thing or not
        // if it is not a thing, it inflates the layour for use this time
        // it will likely be a thing the next time we process this row.
        View listItem = convertView;
        if (listItem == null)
        {
            listItem = LayoutInflater.from(mContext).
                    inflate(this.textViewResourceId, parent,false);
        }

        // get the BasketballRecord object from bucket position which
        //is the row in our listview we are currently filling

        BasketballRecord br = this.basketballRecordList[position];

        TextView nameTV = (TextView)listItem.findViewById(R.id.nameTV);
        TextView ageTV =(TextView)listItem.findViewById(R.id.ageTV);
        TextView jNumTV = (TextView)listItem.findViewById(R.id.jNumTV);
        TextView height_ftTV=(TextView)listItem.findViewById(R.id.height_ftTV);
        TextView height_inTV=(TextView)listItem.findViewById(R.id.height_inTV);

        nameTV.setText(br.getNameString());
        ageTV.setText(br.getAgeString());
        jNumTV.setText(br.getJNumString());
        height_ftTV.setText(br.getHeight_ftString());
        height_inTV.setText(br.getHeight_inString());

        // return the View after we have set all of the values
        return listItem;


    }

}
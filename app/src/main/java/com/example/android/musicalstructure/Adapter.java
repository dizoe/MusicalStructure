package com.example.android.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter extends ArrayAdapter<Songs> {


    public Adapter(Activity context, ArrayList<Songs> songs) {

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Songs currentWord = getItem(position);


        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author);

        authorTextView.setText(currentWord.getAuthor());


        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);

        titleTextView.setText(currentWord.getTitle());


        return listItemView;
    }
}

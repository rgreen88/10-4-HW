package com.example.rynel.listviewholder;

/**
 * Created by rynel on 10/5/2017.
 */

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 10/2/2017.
 */

public class PersonListViewAdapter extends ArrayAdapter<Person2> {

    public PersonListViewAdapter(@NonNull Context context, @LayoutRes int resource, List<Person2> person2List) {
        super(context, resource, person2List);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;

        if( convertView == null ) {
            //inflate the view with custom layout xml
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_item, null);

            //bind the views
            holder = new ViewHolder();
            holder.nameTextView = (TextView) convertView.findViewById( R.id.tvPersonName );
            holder.surnameTextView = (TextView) convertView.findViewById( R.id.tvPersonSurName );

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        //set the values
        Person2 person2 = getItem( position );

        holder.nameTextView.setText( person2.getName() );
        holder.surnameTextView.setText( person2.getSurname() );

        return convertView;
    }

    static class ViewHolder {
        private TextView nameTextView;
        private TextView surnameTextView;
    }
}
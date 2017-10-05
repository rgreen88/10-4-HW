package com.example.rynel.listviewholder;

/**
 * Created by rynel on 10/5/2017.
 */

//unused import even though i try calling it.

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Admin on 10/3/2017.
 */

public class PersonListAdapter extends RecyclerView.Adapter<PersonListAdapter.ViewHolder>{

    List<Person> personList = new ArrayList<>();
    public static final String TAG = "PersonListAdapter";

    public PersonListAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_list_item_1, parent, false);

        Log.d(TAG, "onCreateViewHolder: ");

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.tvPersonName.setText(person.getName());
        holder.tvPersonAge.setText(person.getAge());

        Log.d(TAG, "onBindViewHolder: ");
    }

    @Override
    public int getItemCount() {

        Log.d(TAG, "getItemCount: ");

        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvPersonName;
        TextView tvPersonAge;

        public ViewHolder(View itemView) {
            super(itemView);

            tvPersonName = (TextView) itemView.findViewById(R.id.tvPersonName);
            tvPersonAge = (TextView) itemView.findViewById(R.id.tvPersonAge);
        }
    }
}
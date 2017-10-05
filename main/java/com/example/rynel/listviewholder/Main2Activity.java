package com.example.rynel.listviewholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ListView listView;
    private List<Person2> person2List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        listView = (ListView) findViewById( R.id.listView );

        /*
        String[] arr = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        listView.setAdapter(new ArrayAdapter<String>(this, R.layout.list_view_item, arr));
        */

        person2List = new ArrayList<>();

        person2List.add( new Person2( "Jarrett", "Adkins" ));
        person2List.add( new Person2( "Mac", "Myers" ));
        person2List.add( new Person2( "Jason", "Gomez" ));
        person2List.add( new Person2( "Joseph", "Casal" ));

        PersonListViewAdapter psa = new PersonListViewAdapter( this, R.layout.list_view_item, person2List);

        listView.setAdapter( psa );

    }
}
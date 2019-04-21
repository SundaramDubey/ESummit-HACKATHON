package com.bignerdranch.android.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by user on 8/10/16.
 */
public class CallUs extends AppCompatActivity {
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.best);

        String name;


        int num;
        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.listView );

        // Create and populate a List of planet names.
        String[] planets = new String[] {
                new String("Sundaram    :  +919561720764"),
                new String("Nikita  :  +919561720764"),
                new String("Saurabh    :  +919561720764"),
                new String("Sarthak:  +919561720764"),
                new String("Varun  :  +919561720764"),
                new String("raj  :  +919561720764"),};

        // Create ArrayAdapter using the planet list.
        // Set the ArrayAdapter as the ListView's adapter.

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, planets);

        mainListView.setAdapter(adapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = ((TextView)view).getText().toString();
                if(position==0)
                    setContentView(R.layout.ravi);
                else if(position==1)
                    setContentView(R.layout.ani);
                else if(position==2)
                    setContentView(R.layout.shri);
                else if(position==3)
                    setContentView(R.layout.sid);
                else if(position==4)
                    setContentView(R.layout.vish);
                else if(position==5)
                    setContentView(R.layout.tan);
            }
        });
    }



}

package edu.orangecoastcollege.cs273.bnguyen336.ocmusicevents;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

public class EventListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the adapter which binds the listView with the data in MusicEvent.java
        //Since the data is in an array, we use an ArrayAdapter
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                MusicEvent.titles));


        //setContentView(R.layout.activity_event_list);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int pos, long id) {
        String title = MusicEvent.titles[pos];
        String details = MusicEvent.details[pos];

        Intent detailsIntent = new Intent(this, EventDetailsActivity.class);
        detailsIntent.putExtra("Title", title);
        detailsIntent.putExtra("Details", details);
        startActivity(detailsIntent);
    }

}

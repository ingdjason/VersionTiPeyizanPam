package com.djamoli.versiontipeyizanpam;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ActivityPlages extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plages);

        GridView gridView = (GridView) findViewById(R.id.grid_view_plages);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapterPlages(this));

        /**
         * On Click event for Single Gridview Item
         * */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullImageActivityPlages.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}
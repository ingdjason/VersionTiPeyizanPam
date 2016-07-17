package com.djamoli.versiontipeyizanpam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FullImageActivityFruits extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image_activity_fruits);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapterFruits imageAdapter = new ImageAdapterFruits(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

        TextView textView = (TextView) findViewById(R.id.full_text_view);
        textView.setText(imageAdapter.mThumbText[position]);
    }

    public void btnCom(View v) {
        Toast.makeText(this, "No Comment", Toast.LENGTH_LONG).show();
    }
}
package com.example.futsalkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView booking = (TextView)findViewById(R.id.booking);
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookingIntent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(bookingIntent);
            }
        });

        TextView forum = (TextView)findViewById(R.id.forum);
        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forumIntent = new Intent(MainActivity.this, forum.class);
                startActivity(forumIntent);
            }
        });



    }


    public void telp (View view) {

        String nomor = " ";
        Intent telp = new Intent(Intent.ACTION_DIAL);
        telp.setData(Uri.fromParts("tel",nomor,null));
        startActivity(telp);

    }
}
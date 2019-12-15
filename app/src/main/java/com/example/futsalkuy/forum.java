package com.example.futsalkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class forum extends AppCompatActivity implements View.OnClickListener {

    EditText kirimnama,kirimisi;
    Button kirim;
    TextView hasilnama,hasilisi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

        kirimnama = (EditText) findViewById(R.id.nama);
        kirimisi = (EditText) findViewById(R.id.isi);
        kirim = (Button) findViewById(R.id.kirim);
        hasilnama = (TextView) findViewById(R.id.hasilnama);
        hasilisi = (TextView) findViewById(R.id.hasilisi);


        kirim.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        hasilnama.setText(kirimnama.getText());
        hasilisi.setText(kirimisi.getText());
    }


//
//    @Override
//    public void OnClick (View v){
//        hasilnama.setText(kirimnama.getText());
//        hasilisi.setText(kirimisi.getText());
//    }
}

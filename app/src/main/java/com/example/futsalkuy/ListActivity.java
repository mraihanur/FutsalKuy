package com.example.futsalkuy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Angkasa Futsal", "Jl. MP. Mangkunegara 0897-8737-475"));
        words.add(new Word("Adofo Futsal", "Lrg. Anggrek No. 1079,8 Ilir (0711) 5703988"));
        words.add(new Word("Jupiter Futsal", "Jl. Jendral Basuki Rahmat 0851-0912-2277"));
        words.add(new Word("Raja Futsal", "Komplek PTC Sport Centre"));
        words.add(new Word("Tiger Futsal", "Jl. Macan Lindungan 07114471999"));
        words.add(new Word("First Futsal", "Jl. Husni Tamrin 0819-3339-5777"));
        words.add(new Word("Gavin Futsal", "Jl. Pemiri No. 01 (0711) 820931"));
        words.add(new Word("Dunia Futsal", "Jl. Dr. M. Isa No. 134 0812-7360-2240"));
        words.add(new Word("Swadaya Futsal", "Jl. Swadaya-Perikanan I 0852-1987-9686"));
        words.add(new Word("Pinus Futsal", "Jl. Jogja 0857-0965-3669"));
        words.add(new Word("Boom Futsal", "Jl. Bay Salim No. 1 (0711) 3566888"));
        words.add(new Word("Barokah Futsal", "Jl. Lintas Bar 0821-7734-5566"));
        words.add(new Word("FB Futsal", "Jl. Supersemar Lorong Sepak Bola (0711) 365612"));
        words.add(new Word("Big One Futsal", "Jl. Plaju 0895-3414-51770"));
        words.add(new Word("Seventh Futsal", "Jl. Suka Senang 0852-6872-5406"));
        words.add(new Word("Momea Futsal", "Jl. Sumpah Pemuda Blok K No. 1A 0878-7794-8000"));
        words.add(new Word("Markas Futsal", "Jl. Residen Abdul Rozak No. 41 C (0711) 719564"));
        words.add(new Word("Tri Star Futsal", "Lr. Puncak Harapan VI 0838-9347-4816"));
        words.add(new Word("Bima Futsal", "Jl. Adi Sucipto 0896-0239-6900"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


    public void telp (View view) {

        String nomor = " ";
        Intent telp = new Intent(Intent.ACTION_DIAL);
        telp.setData(Uri.fromParts("tel",nomor,null));
        startActivity(telp);

    }
}
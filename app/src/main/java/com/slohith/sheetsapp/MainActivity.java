package com.slohith.sheetsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<sheetclass>words = new ArrayList<sheetclass>();
        words.add(new sheetclass("History of Arch","This is boring"));
        words.add(new sheetclass("Theory of Arch","I dont know about this"));
        words.add(new sheetclass("Sketching","This is fun"));
        words.add(new sheetclass("Drafting","This takes a lot of hard work"));
        words.add(new sheetclass("Eating lays","My love"));
        words.add(new sheetclass("Eating momos","You know why i like it"));
        words.add(new sheetclass("Pizza??","Any time any day"));
        words.add(new sheetclass("cold coffee","yumm"));
        words.add(new sheetclass("Anime","Interesting"));
        words.add(new sheetclass("Harry potter","Oh I love this"));
        words.add(new sheetclass("vampire dairies","Scary"));
        words.add(new sheetclass("rrsa","woah"));
        words.add(new sheetclass("abstract","ok"));
        words.add(new sheetclass("water colors","Nice"));
        sheetadapter sh = new sheetadapter(this,words);
        ListView li=(ListView) findViewById(R.id.list);
        li.setAdapter(sh);
    }
}

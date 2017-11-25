package com.example.nikhil.listexample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            // Array of strings...
            String[] androidVersion = {"jellybean","kitkat","lolipop","marshmallow",
                    "nougat"};



                ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.activity_listview, androidVersion);

                ListView listView = (ListView) findViewById(R.id.androidVersionList);
                listView.setAdapter(adapter);
            }
        }








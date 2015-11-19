package com.isolomonik.stage2;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
ListView listView;

    String city = "Cherkasy,UA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listView);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detailCont, new WeatherFragment())
                    .commit();
        }


    }

    String getCity(){
        return city;
    }

//
}

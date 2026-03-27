package com.example.listyprojekt2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<RzeczDoZrobienia> arrayListRzeczyDoZrobienia;
    ArrayAdapter<RzeczDoZrobienia> arrayAdapterRzeczyDoZrobienia;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        arrayListRzeczyDoZrobienia = new ArrayList<>();
        arrayListRzeczyDoZrobienia.add(new RzeczDoZrobienia("Nauczyc sie na aplikacje mobilne", 5));
        arrayListRzeczyDoZrobienia.add(new RzeczDoZrobienia("isc do kina!", 3));
        arrayListRzeczyDoZrobienia.add(new RzeczDoZrobienia("Posprzatac pokoj", 1));
        arrayListRzeczyDoZrobienia.add(new RzeczDoZrobienia("kupic chleb", 5));
        arrayAdapterRzeczyDoZrobienia = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListRzeczyDoZrobienia);
        listView.setAdapter(arrayAdapterRzeczyDoZrobienia);




    }
}
package com.example.java_drop_down;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView suggestion_box;
    Spinner items;

    ArrayList<String> foods = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         suggestion_box = findViewById(R.id.suggestion_Box);
        items = findViewById(R.id.items);

        foods.add("apple");
        foods.add("orange");
        foods.add("Banana");
        foods.add("Cat");
        foods.add("Egg");
        foods.add("Dog");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,foods);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,foods);

        suggestion_box.setAdapter(adapter);
        items.setAdapter(adapter);


    }
}
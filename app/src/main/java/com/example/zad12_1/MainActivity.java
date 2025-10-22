package com.example.zad12_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView krajRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        krajRecyclerView = findViewById(R.id.countryRecyclerView);

        List<kraje> kraje = new ArrayList<>();
        kraje.add(new kraje("Polska"));
        kraje.add(new kraje("Niemcy"));
        kraje.add(new kraje("Hiszpania"));
        kraje.add(new kraje("Russia"));
        kraje.add(new kraje("Ukraine"));
        kraje.add(new kraje("Finland"));
        kraje.add(new kraje("Romania"));
        kraje.add(new kraje("Portugal"));
        kraje.add(new kraje("Serbia"));



        krajeAdapter adapter = new krajeAdapter(kraje);

        krajRecyclerView.setAdapter(adapter);
        krajRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}


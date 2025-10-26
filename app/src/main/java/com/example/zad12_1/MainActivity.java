package com.example.zad12_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button btnKraje, btnProdukty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        btnKraje = findViewById(R.id.btnKraje);
        btnProdukty = findViewById(R.id.btnProdukty);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        pokazListeKrajow();

        btnKraje.setOnClickListener(v -> pokazListeKrajow());
        btnProdukty.setOnClickListener(v -> pokazListeProduktow());
    }

    private void pokazListeKrajow() {
        List<kraje> krajeList = new ArrayList<>();
        krajeList.add(new kraje("Polska"));
        krajeList.add(new kraje("Niemcy"));
        krajeList.add(new kraje("Hiszpania"));
        krajeList.add(new kraje("Rosja"));
        krajeList.add(new kraje("Ukraina"));
        krajeList.add(new kraje("Finlandia"));
        krajeList.add(new kraje("Rumunia"));
        krajeList.add(new kraje("Portugalia"));
        krajeList.add(new kraje("Serbia"));
        krajeList.add(new kraje("Francja"));

        krajeAdapter adapter = new krajeAdapter(krajeList);
        recyclerView.setAdapter(adapter);
    }

    private void pokazListeProduktow() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Chleb", 4.20f));
        products.add(new Product("Mleko", 3.50f));
        products.add(new Product("Masło", 9.99f));
        products.add(new Product("Ser", 12.49f));
        products.add(new Product("Jajka", 8.00f));
        products.add(new Product("Czekolada", 6.30f));
        products.add(new Product("Kawa", 25.00f));
        products.add(new Product("Herbata", 14.20f));
        products.add(new Product("Woda", 2.50f));
        products.add(new Product("Sok pomarańczowy", 5.75f));

        productAdapter adapter = new productAdapter(products);
        recyclerView.setAdapter(adapter);
    }
}

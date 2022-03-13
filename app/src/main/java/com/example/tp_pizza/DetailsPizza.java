package com.example.tp_pizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tp_pizza.beans.Pizza;
import com.example.tp_pizza.service.PizzaService;

public class DetailsPizza extends AppCompatActivity {
    private PizzaService ps;
    private ImageView image;
    private TextView desc;
    private TextView nom,ingred;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizzas);

        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));
        ps = PizzaService.getInstance();

        image = findViewById(R.id.photo);
        nom = findViewById(R.id.nom);
        desc = findViewById(R.id.desc);
        ingred=findViewById(R.id.ingred);


        Pizza p = ps.findById(id);
        image.setImageResource(p.getPhoto());
        desc.setText(p.getDesc());
        nom.setText(p.getNom());
        ingred.setText(p.getDetaisIngred());
    }
}

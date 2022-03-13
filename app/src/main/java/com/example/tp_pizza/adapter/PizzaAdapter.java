package com.example.tp_pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp_pizza.R;
import com.example.tp_pizza.beans.Pizza;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Pizza> pizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Pizza> fruits) {
        this.pizzas = fruits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return pizzas.size();    }

    @Override
    public Object getItem(int position) {
        return pizzas.get(position);    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.pizza_item, null);

        TextView idf = convertView.findViewById(R.id.idf);
        TextView nom = convertView.findViewById(R.id.nom);
        ImageView photo = convertView.findViewById(R.id.photo);
        TextView duree = convertView.findViewById(R.id.duree);

        idf.setText(pizzas.get(position).getId()+"");
        nom.setText(pizzas.get(position).getNom());
        photo.setImageResource(pizzas.get(position).getPhoto());
        duree.setText(pizzas.get(position).getDuree());





        return convertView;    }
}

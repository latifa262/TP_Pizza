package com.example.tp_pizza.service;

import com.example.tp_pizza.Dao.IDao;
import com.example.tp_pizza.beans.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaService implements IDao<Pizza> {

    private List <Pizza> pizzas;
    private static PizzaService instance;

    private PizzaService() {
        this.pizzas = new ArrayList<>();
    }

    public static PizzaService getInstance() {
        if(instance == null)
            instance =  new PizzaService();
        return instance;
    }
    @Override
    public boolean create(Pizza o) {
        return pizzas.add(o);
    }

    @Override
    public boolean update(Pizza o) {
        return false;
    }

    @Override
    public boolean delete(Pizza o) {
        return pizzas.remove(o);
    }

    @Override
    public Pizza findById(int id) {
        for(Pizza f : pizzas){
            if(f.getId() == id)
                return f;
        }
        return null;
    }

    @Override
    public List<Pizza> findAll() {
        return pizzas;
    }
}

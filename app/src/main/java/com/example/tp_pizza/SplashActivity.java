package com.example.tp_pizza;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.tp_pizza.beans.Pizza;

public class SplashActivity extends AppCompatActivity {
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        logo = findViewById(R.id.logo);

        //Appliquer une animation de rotation sur le logo
        //res->anim->anim.xml

        Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        logo.startAnimation(aniRotate);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent intent  = new Intent(SplashActivity.this, PizzaListActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }
}
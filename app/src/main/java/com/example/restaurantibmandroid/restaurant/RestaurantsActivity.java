package com.example.restaurantibmandroid.restaurant;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantibmandroid.R;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_restaurant);
    }
}

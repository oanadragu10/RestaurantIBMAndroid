package com.example.restaurantibmandroid.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantibmandroid.Item;
import com.example.restaurantibmandroid.ItemAdapter;
import com.example.restaurantibmandroid.R;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {
    private String image;
    private String title, subtitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        recyclerView.setHasFixedSize(true);

        ItemAdapter adapter = new ItemAdapter(getMockItems(), getBaseContext());
        recyclerView.setAdapter(adapter);


    }


    private ArrayList<Item> getMockItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.clink, "The Clink Restaurant", "The first Clink Restaurant opened in 2009 at HMP High Down in Surrey, when Alberto Crisci, then catering manager"));
        items.add(new Item(R.drawable.chelsea, "The Chelsea Corner", "Authentic Italian cuisine with the freshest ingredients rightly dictated by the season. "));
        items.add(new Item(R.drawable.res3, "Companero", "Compañero is the new Spanish Fusion Restaurant brought to you by Nikolaus Greig and utilising his vast experience in food & wine."));
        items.add(new Item(R.drawable.clink, "Chez Antoinette Victoria", "Subtitle3"));
        items.add(new Item(R.drawable.clink, "The Gojk", "Subtitle3"));
        items.add(new Item(R.drawable.clink, "Alyn Williams at the Westbury", "Subtitle3"));
        return items;
    }


}


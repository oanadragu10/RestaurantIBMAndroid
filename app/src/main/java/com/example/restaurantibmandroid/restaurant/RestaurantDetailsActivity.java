package com.example.restaurantibmandroid.restaurant;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.restaurantibmandroid.Images;
import com.example.restaurantibmandroid.Item;
import com.example.restaurantibmandroid.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDetailsActivity extends AppCompatActivity {

    int image;
    String title, subtitle;
    private String URL_JSON = "blob:https://web.whatsapp.com/fdc2cc31-a59f-47f4-9166-3cd94ba7f98b";
    private JsonArrayRequest ArrayRequest ;
    private RequestQueue requestQueue ;
    private List<Images> items = new ArrayList<>();
    private RecyclerView recyclerView ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_restaurant);

        recyclerView = findViewById(R.id.recycler_view);
        //json();

    }

    /*public void json() {
        ArrayRequest = new JsonArrayRequest(URL_JSON, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;

                for(int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        Images item = new Images();
                        item.setImagePath(jsonObject.getString("imagePath"));

                        items.add(item);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }*/
}

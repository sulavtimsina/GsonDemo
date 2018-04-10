package com.example.sulavtimsina.gsondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.sulavtimsina.gsondemo.model.Product;
import com.example.sulavtimsina.gsondemo.utils.FileUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class JsonFromFile extends AppCompatActivity {

    TextView tvJson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvJson = findViewById(R.id.tvJson);

        Gson gson = new GsonBuilder().create();
        String jsonString = FileUtil.getFileString(getApplicationContext());
        Product product = gson.fromJson(jsonString, Product.class);

        tvJson.setText(product.toString());
    }
}

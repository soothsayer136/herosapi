package com.herosapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class get extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://10.0.2.2:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



    }
}

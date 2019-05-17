package com.herosapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Model.Model;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class post extends AppCompatActivity {
    private EditText edHeroesname, edHeroesdesc;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);



        edHeroesname = findViewById(R.id.edHeroesname);
        edHeroesdesc = findViewById(R.id.edHeroesdesc);
        btnSubmit = findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Submit();
            }

            private void Submit() {
                String name = edHeroesname.getText().toString();
                String desc = edHeroesdesc.getText().toString();


                Model model = new Model(name, desc);


                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://10.0.2.2:3000/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();








            }
        });
    }
}

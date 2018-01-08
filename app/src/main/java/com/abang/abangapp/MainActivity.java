package com.abang.abangapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.abang.abangapp.car_owner.car_owner;
import com.abang.abangapp.car_renter.car_renter;

public class MainActivity extends AppCompatActivity {

    Button btnOwner, btnRenter;
    //HEHEHE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOwner = (Button)findViewById(R.id.btnOwner);
        btnRenter = (Button)findViewById(R.id.btnRenter);

        btnOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),car_owner.class);
                startActivity(intent);
            }
        });
        btnRenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),car_renter.class);
                startActivity(intent);
            }
        });


       //gege
        //XD

    }
}

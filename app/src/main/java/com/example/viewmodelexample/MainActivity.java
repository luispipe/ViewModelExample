package com.example.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Realicen la lógica para que se carguen las
          interfaces de ViewModel y la de WithOutViewModel
         */
        Button btVM= findViewById(R.id.buttonVM);
        Button btWOVM= findViewById(R.id.buttonWOVM);

        Intent vm= new Intent(MainActivity.this, ViewModelActivity.class);
        Intent wovm= new Intent(MainActivity.this, WithoutVMActivity.class);

        btVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(vm);
            }
        });

        btWOVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(wovm);
            }
        });

    }
}
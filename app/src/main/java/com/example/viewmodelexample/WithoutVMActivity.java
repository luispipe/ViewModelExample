package com.example.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WithoutVMActivity extends AppCompatActivity {

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_vmactivity);

        /* Una vez se presione el botón de aumentar
        * En el textView inicia el contador
        * */
        TextView tvValue= findViewById(R.id.textWOViewVM);
        Button btAument= findViewById(R.id.btWOViewModel);


        btAument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvValue.setText(String.valueOf(count));
            }
        });


    }
}
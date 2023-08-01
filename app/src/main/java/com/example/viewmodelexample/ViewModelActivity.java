package com.example.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);

    }

    public void viewConfiguration(){
        ViewModel vm= new ViewModelProvider(this).get(ViewModel.class);
        TextView tvVM= findViewById(R.id.textViewVM);
        Button btAument= findViewById(R.id.btViewModel);

        btAument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vm.aument(Integer.parseInt(tvVM.getText().toString()));
            }
        });

        Observer<Integer> obj_observer= new Observer<Integer>() {
            @Override
            public void onChanged(Integer result) {
                tvVM.setText(result.toString());
            }
        };
        vm.getResultado().observe(this,obj_observer);

        }

    }

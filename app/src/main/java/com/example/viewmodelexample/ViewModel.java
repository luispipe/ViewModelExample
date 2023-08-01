package com.example.viewmodelexample;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class ViewModel extends androidx.lifecycle.ViewModel{
    MutableLiveData<Integer> result;

    public ViewModel(){
        result= new MutableLiveData<>();
    }

    public LiveData<Integer> getResultado(){
        return result;
    }

    public void aument(int value){
        result.setValue(Model.aument(value));
    }
}

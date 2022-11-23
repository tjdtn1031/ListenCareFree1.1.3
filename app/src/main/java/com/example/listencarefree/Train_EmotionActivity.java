package com.example.listencarefree;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Train_EmotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_emotion);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}

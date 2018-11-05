package com.mvp.pattern.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvp.pattern.R;

public class MainActivity extends AppCompatActivity {

    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        return  intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

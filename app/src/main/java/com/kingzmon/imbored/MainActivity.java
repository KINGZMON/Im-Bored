package com.kingzmon.imbored;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView activities;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activities = findViewById(R.id.activity_here);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
    }

    public void showActivity(View view) {
        progressBar.setVisibility(View.VISIBLE);
        DataLoader dl = new DataLoader(activities, progressBar);
        dl.execute();
    }


}
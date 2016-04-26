package com.example.samprice.applytojob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by samprice on 4/25/16.
 */
public class Employer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.employer2);
    }
    public void onJobPostStarted(View v){
        Intent myIntent = new Intent(Employer.this, AddingJob.class);
        startActivity(myIntent);
    }

    public void onClickActMain2(View v){
        Intent myIntent = new Intent(Employer.this, MainActivity.class);
        startActivity(myIntent);
    }

}

package com.example.samprice.applytojob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Employer extends AppCompatActivity {
    public String job1, job2, job3, job4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.employer2);
    }
    public void onJobPostStarted(View v){
        Intent myIntent = new Intent(Employer.this, AddingJob.class);
        Bundle title = getIntent().getExtras();
        job1 = title.getString("jobTitle1");
        job2 = title.getString("jobTitle2");
        job3 = title.getString("jobTitle3");
        job4 = title.getString("jobTitle4");

        Bundle bundle = new Bundle();
        bundle.putString("jobTitle1", job1);
        bundle.putString("jobTitle2", job2);
        bundle.putString("jobTitle3", job3);
        bundle.putString("jobTitle4", job4);
        myIntent.putExtras(bundle);
        startActivity(myIntent);
    }
    public void onClickViewJobs(View v){
        Intent myIntent= new Intent(Employer.this, ViewApplicants.class);

        Bundle title = getIntent().getExtras();
        job1 = title.getString("jobTitle1");
        job2 = title.getString("jobTitle2");
        job3 = title.getString("jobTitle3");
        job4 = title.getString("jobTitle4");

        Bundle bundle = new Bundle();
        bundle.putString("jobTitle1", job1);
        bundle.putString("jobTitle2", job2);
        bundle.putString("jobTitle3", job3);
        bundle.putString("jobTitle4", job4);
        myIntent.putExtras(bundle);

        startActivity(myIntent);
    }

    public void onClickActMain2(View v){
        Intent myIntent = new Intent(Employer.this, MainActivity.class);
        startActivity(myIntent);
    }



}

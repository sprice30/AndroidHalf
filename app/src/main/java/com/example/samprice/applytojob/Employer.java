package com.example.samprice.applytojob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class Employer extends AppCompatActivity {
    public ArrayList<String> job1 = new ArrayList<String>();
    ArrayList<String> dest = new ArrayList<String>();
    ArrayList<String> location = new ArrayList<String>();
    ArrayList<String> salary = new ArrayList<String>();

    int currNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.employer2);
    }
    public void onJobPostStarted(View v){
        Intent myIntent = new Intent(Employer.this, AddingJob.class);

        Bundle titleList = getIntent().getExtras();
        job1 = titleList.getStringArrayList("titleList");
        dest = titleList.getStringArrayList("des");
        location = titleList.getStringArrayList("loca");
        salary = titleList.getStringArrayList("sal");
       // currNum = titleList.getInt("Current");

        Bundle bundle = new Bundle();
        bundle.putStringArrayList("titleList", job1);
        bundle.putStringArrayList("des", dest);
        bundle.putStringArrayList("loca", location);
        bundle.putStringArrayList("sal", salary);
       // bundle.putInt("Current", currNum);
        myIntent.putExtras(bundle);

        startActivity(myIntent);
    }
    public void onClickViewJobs(View v){
        Intent myIntent= new Intent(Employer.this, ViewApplicants.class);
        Bundle titleList = getIntent().getExtras();
        job1 = titleList.getStringArrayList("titleList");
        dest = titleList.getStringArrayList("des");
        location = titleList.getStringArrayList("loca");
        salary = titleList.getStringArrayList("sal");
        // currNum = titleList.getInt("Current");

        Bundle bundle = new Bundle();
        bundle.putStringArrayList("titleList", job1);
        bundle.putStringArrayList("des", dest);
        bundle.putStringArrayList("loca", location);
        bundle.putStringArrayList("sal", salary);
       // bundle.putInt("Current", currNum);
        myIntent.putExtras(bundle);

        startActivity(myIntent);
    }

    public void onClickActMain2(View v){
        Intent myIntent = new Intent(Employer.this, MainActivity.class);
        startActivity(myIntent);
    }



}

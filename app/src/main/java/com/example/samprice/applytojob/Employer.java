package com.example.samprice.applytojob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Employer extends AppCompatActivity {
    public String jobSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.employer2);
    }
    public void onJobPostStarted(View v){
        Intent myIntent = new Intent(Employer.this, AddingJob.class);
        startActivity(myIntent);
    }
    public void onClickViewJobs(View v){
        Intent myIntent= new Intent(Employer.this, ViewApplicants.class);
        startActivity(myIntent);
    }

    public void onClickActMain2(View v){
        Intent myIntent = new Intent(Employer.this, MainActivity.class);
        startActivity(myIntent);
    }

    /*
        public String getJobSelected(View v){
            return jobSelected;
     }


      /*  public void onViewJobs(View v){
            setContentView(R.layout.view1);
            AddingJob titles = new AddingJob();


            final Spinner jobsPosted = (Spinner) findViewById(R.id.spinner1);
            String[] items = new String[]{titles.getJob1(v), titles.getJob2(v), titles.getJob3(v), titles.getJob4(v)};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
            jobsPosted.setAdapter(adapter);


            jobsPosted.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    jobSelected = jobsPosted.getSelectedItem().toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


        }
    */


}

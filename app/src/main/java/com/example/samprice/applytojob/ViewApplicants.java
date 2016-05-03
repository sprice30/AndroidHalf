package com.example.samprice.applytojob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class ViewApplicants extends AppCompatActivity {
   String jobSelected, job1, job2,job3, job4;
    TextView t1, t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.view1);
        viewJobsPosted();


    }

    public void viewJobsPosted(){
        setContentView(R.layout.paj3);
        t1 = (TextView) findViewById(R.id.c1);
        t2 = (TextView) findViewById(R.id.c2);
        t3 = (TextView) findViewById(R.id.c3);
        t4 = (TextView) findViewById(R.id.c4);

        job1 = t1.getText().toString();
        job2 = t2.getText().toString();
        job3 = t3.getText().toString();
        job4 = t4.getText().toString();

        setContentView(R.layout.view1);


        final Spinner jobsPosted = (Spinner) findViewById(R.id.spinner1);
        String[] items = new String[]{job1, job2, job3, job4};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

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


public void onClickCancel(View v){
    Intent myIntent = new Intent(ViewApplicants.this, Employer.class);
    startActivity(myIntent);

}
    public void onClickBack(View v){

        setContentView(R.layout.view1);
        final Spinner jobsPosted = (Spinner) findViewById(R.id.spinner1);
        String[] items = new String[]{job1, job2, job3, job4};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

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


    public void onClickApplicants(View v){
        Employer jobChosen = new Employer();
        setContentView(R.layout.view2);


        final TextView viewing1 = (TextView) findViewById(R.id.textView40);
        String text = "Viewing " + jobSelected + " job.";
        assert viewing1 != null;
        viewing1.setText(text);

    }


}

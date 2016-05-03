package com.example.samprice.applytojob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ViewApplicants extends AppCompatActivity {
   String jobSelected, idSelected, job1, job2,job3, job4, num;
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

        t1.setText("Hello");

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
        setContentView(R.layout.view2);

        final TextView viewing1 = (TextView) findViewById(R.id.textView40);
        String text = "Viewing " + jobSelected + " job.";

        viewing1.setText(text);

        final TextView job1 = (TextView) findViewById(R.id.button21);
        job1.setText("23457");
        final TextView job2 = (TextView) findViewById(R.id.button22);
        job2.setText("97453");
        final TextView job3 = (TextView) findViewById(R.id.button23);
        job3.setText("23098");
        final TextView job4 = (TextView) findViewById(R.id.button24);
        job4.setText("98604");
        final TextView job5 = (TextView) findViewById(R.id.button25);
        job5.setText("17742");



    }

    public void onClickNum(){
        setContentView(R.layout.view3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        viewing1.setText("Viewing Applicant " + num + ".");
    }


    public void onClickNum1(View v){
        num = "23457";
        onClickNum();

       // final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        //viewing1.setText("Viewing Applicant " + idSelected + ".");


    }

    public void onClickNum2(View v){
       // setContentView(R.layout.view3);
        num = "97453";
        onClickNum();

      //  final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        //viewing1.setText("Viewing Applicant " + idSelected + ".");


    }
    public void onClickNum3(View v){
     //   setContentView(R.layout.view3);
        num = "23098";
        onClickNum();

       // final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        //viewing1.setText("Viewing Applicant " + idSelected + ".");


    }
    public void onClickNum4(View v){
       // setContentView(R.layout.view3);
        num = "98604";
        onClickNum();

        //final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        //viewing1.setText("Viewing Applicant " + idSelected + ".");


    }
    public void onClickNum5(View v){
       // setContentView(R.layout.view3);
        num = "17742";

        onClickNum();
       // final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        //viewing1.setText("Viewing Applicant " + idSelected + ".");


    }

    public void onClickViewResume(View v){
        setContentView(R.layout.view_res);
    }

    public void onClickViewOther(View v){
        setContentView(R.layout.view_other);
    }

    public void onClickViewTags(View v){
        setContentView(R.layout.view_tags);
    }



    public void onClickBack2(View v){
        setContentView(R.layout.view3);

    }

}

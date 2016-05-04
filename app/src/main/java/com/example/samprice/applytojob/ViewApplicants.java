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
import java.util.Random;

public class ViewApplicants extends AppCompatActivity {
   String jobSelected, job1, job2,job3,job4, num;
    String num1, num2, num3, num4, num5;
    TextView t1, t2, t3, t4, j1, j2, j3, j4, j5;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.view1);
        viewJobsPosted();


    }



    public void viewJobsPosted(){

      Bundle title = getIntent().getExtras();
        job1 = title.getString("jobTitle1");
        job2 = title.getString("jobTitle2");
        job3 = title.getString("jobTitle3");
        job4 = title.getString("jobTitle4");

        setContentView(R.layout.view1);

        if (job1 == null){
            job1 = "";
        }
        if (job2 == null){
            job2 = "";
        }
        if (job3 == null){
            job3 = "";
        }
        if (job4 == null){
            job4 = "";
        }


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
    Bundle bundle = new Bundle();
    bundle.putString("jobTitle1", job1);
    bundle.putString("jobTitle2", job2);
    bundle.putString("jobTitle3", job3);
    bundle.putString("jobTitle4", job4);
    myIntent.putExtras(bundle);

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

public void onClickBack3(View v){
    setContentView(R.layout.view2);

    final TextView viewing1 = (TextView) findViewById(R.id.textView40);
    String text = "Viewing Applicants for " + jobSelected + " Job.";
    viewing1.setText(text);

    final TextView job1 = (TextView) findViewById(R.id.button21);
    job1.setText("ID: " +num1);
    final TextView job2 = (TextView) findViewById(R.id.button22);
    job2.setText("ID: " +num2);
    final TextView job3 = (TextView) findViewById(R.id.button23);
    job3.setText("ID: " +num3);
    final TextView job4 = (TextView) findViewById(R.id.button24);
    job4.setText("ID: " +num4);
    final TextView job5 = (TextView) findViewById(R.id.button25);
    job5.setText("ID: " +num5);

}

    public void onClickApplicants(View v){
        setContentView(R.layout.view2);

        final TextView viewing1 = (TextView) findViewById(R.id.textView40);
        String text = "Viewing Applicants for " + jobSelected + "Job.";

        viewing1.setText(text);
        num1 =String.valueOf(rando()) ;
        num2 =String.valueOf(rando()) ;
        num3= String.valueOf(rando());
        num4 =String.valueOf(rando()) ;
        num5 = String.valueOf(rando());


        final TextView job1 = (TextView) findViewById(R.id.button21);
        job1.setText("ID: " + num1);
        final TextView job2 = (TextView) findViewById(R.id.button22);
        job2.setText("ID: " +num2);
        final TextView job3 = (TextView) findViewById(R.id.button23);
        job3.setText("ID: " +num3);
        final TextView job4 = (TextView) findViewById(R.id.button24);
        job4.setText("ID: " +num4);
        final TextView job5 = (TextView) findViewById(R.id.button25);
        job5.setText("ID: " +num5);

    }

    public int rando(){
        int randomNumber = new Random().nextInt(9000) + 1000;

        return randomNumber;
    }

    public void onClickNum(){
        setContentView(R.layout.view3);
        final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        viewing1.setText("Viewing Applicant " + num + ".");
    }


    public void onClickNum1(View v){
        j1 = (TextView) findViewById(R.id.button21);
        num = j1.getText().toString();
        onClickNum();
    }

    public void onClickNum2(View v){
        j2 = (TextView) findViewById(R.id.button22);
        num = j2.getText().toString();
        onClickNum();
    }
    public void onClickNum3(View v){
        j3 = (TextView) findViewById(R.id.button23);
        num = j3.getText().toString();
        onClickNum();
    }
    public void onClickNum4(View v){
        j4 = (TextView) findViewById(R.id.button24);
        num = j4.getText().toString();
        onClickNum();
    }
    public void onClickNum5(View v){
        j5 = (TextView) findViewById(R.id.button25);
        num = j5.getText().toString();
        onClickNum();
    }

    public void onClickViewResume(View v){
        setContentView(R.layout.view_res);
        final TextView viewing1 = (TextView) findViewById(R.id.textView42);
        viewing1.setText("Viewing Resume for " + num + ".");
    }

    public void onClickViewOther(View v){
        setContentView(R.layout.view_other);
        final TextView viewing1 = (TextView) findViewById(R.id.textView44);
        viewing1.setText("Viewing Other Documents for " + num + ".");
    }

    public void onClickViewTags(View v){
        setContentView(R.layout.view_tags);
        final TextView viewing1 = (TextView) findViewById(R.id.textView45);
        viewing1.setText("Viewing Matching Tags for " + num + ".");
    }



    public void onClickBack2(View v){
        onClickNum();

    }

}

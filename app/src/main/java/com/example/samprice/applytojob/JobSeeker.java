package com.example.samprice.applytojob;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by samprice on 5/3/16.
 */
public class JobSeeker extends AppCompatActivity {
    private EditText mSearch, mEmployer, mTag, mJob;
    public String job = "empty", employer ="empty", tags= "empty", type= "empty";
    public int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.jobseeker);
        TextView myText = (TextView) findViewById(R.id.textView);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myText1 = (TextView) findViewById(R.id.button);
        TextView myText2 = (TextView) findViewById(R.id.button3);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button15);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

    }

    public void onManage(View v){
        Intent myIntent = new Intent(JobSeeker.this, Resume.class);
        startActivity(myIntent);
    }

    public void onClickMain(View v){
        Intent myIntent = new Intent(JobSeeker.this, MainActivity.class);
        startActivity(myIntent);
    }

    public void onClickApply2(View v){

        setContentView(R.layout.search2);
        TextView myText = (TextView) findViewById(R.id.textView47);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myText1 = (TextView) findViewById(R.id.editPosition);
        TextView myText2 = (TextView) findViewById(R.id.editEmployer);
        TextView myText3 = (TextView) findViewById(R.id.editTags);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);


        TextView myTextBack = (TextView) findViewById(R.id.button18);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

    }
    public void onClickApplyP(View v) {
        job = mSearch.getText().toString();
        setContentView(R.layout.apply);

        TextView myText = (TextView) findViewById(R.id.textView8);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText.setTypeface(myFont);

        final TextView viewing1 = (TextView) findViewById(R.id.textView8);
        viewing1.setText(" " + job);


        TextView myJob = (TextView) findViewById(R.id.textView7);
        TextView myDes = (TextView) findViewById(R.id.textView9);
        TextView myDes2 = (TextView) findViewById(R.id.textView10);
        TextView myLoca = (TextView) findViewById(R.id.textView11);
        TextView myLoca2 = (TextView) findViewById(R.id.textView12);
        TextView mySal = (TextView) findViewById(R.id.textView13);
        TextView mySal2 = (TextView) findViewById(R.id.textView14);


        myDes2.setTypeface(myFont);
        myLoca2.setTypeface(myFont);
        mySal2.setTypeface(myFont);


        Typeface myFont1 = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");

        myDes.setTypeface(myFont1);
        myJob.setTypeface(myFont1);
        myLoca.setTypeface(myFont1);
        mySal.setTypeface(myFont1);

        TextView myAll = (TextView) findViewById(R.id.button4);
        TextView myApply = (TextView) findViewById(R.id.button5);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myAll.setTypeface(myFont2);
        myApply.setTypeface(myFont2);


    }

    public void onClickApplyE(View v) {
        employer = mEmployer.getText().toString();
        setContentView(R.layout.apply_employer);

        TextView myText = (TextView) findViewById(R.id.textView16);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        final TextView viewing1 = (TextView) findViewById(R.id.textView16);
        viewing1.setText("Job with " + employer + " employer.");

        TextView myJob = (TextView) findViewById(R.id.textView15);
        TextView myDes = (TextView) findViewById(R.id.textView17);
        TextView myDes2 = (TextView) findViewById(R.id.textView18);
        TextView myLoca = (TextView) findViewById(R.id.textView19);
        TextView myLoca2 = (TextView) findViewById(R.id.textView20);
        TextView mySal = (TextView) findViewById(R.id.textView21);
        TextView mySal2 = (TextView) findViewById(R.id.textView22);


        myDes2.setTypeface(myFont);
        myLoca2.setTypeface(myFont);
        mySal2.setTypeface(myFont);


        Typeface myFont1 = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");

        myDes.setTypeface(myFont1);
        myJob.setTypeface(myFont1);
        myLoca.setTypeface(myFont1);
        mySal.setTypeface(myFont1);

        TextView myAll = (TextView) findViewById(R.id.button9);
        TextView myApply = (TextView) findViewById(R.id.button5);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myAll.setTypeface(myFont2);
        myApply.setTypeface(myFont2);


    }
    public void onClickApplyT(View v) {
        tags = mTag.getText().toString();
        setContentView(R.layout.apply_tags);

        TextView myText = (TextView) findViewById(R.id.textView24);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        final TextView viewing1 = (TextView) findViewById(R.id.textView24);
        viewing1.setText("Job with " + tags + " tags.");

        TextView myJob = (TextView) findViewById(R.id.textView23);
        TextView myDes = (TextView) findViewById(R.id.textView25);
        TextView myDes2 = (TextView) findViewById(R.id.textView26);
        TextView myLoca = (TextView) findViewById(R.id.textView27);
        TextView myLoca2 = (TextView) findViewById(R.id.textView28);
        TextView mySal = (TextView) findViewById(R.id.textView29);
        TextView mySal2 = (TextView) findViewById(R.id.textView30);


        myDes2.setTypeface(myFont);
        myLoca2.setTypeface(myFont);
        mySal2.setTypeface(myFont);


        Typeface myFont1 = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");

        myDes.setTypeface(myFont1);
        myJob.setTypeface(myFont1);
        myLoca.setTypeface(myFont1);
        mySal.setTypeface(myFont1);

        TextView myAll = (TextView) findViewById(R.id.button4);
        TextView myApply = (TextView) findViewById(R.id.button11);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myAll.setTypeface(myFont2);
        myApply.setTypeface(myFont2);

    }

    public void onClickAllResultsP(View v){
        job = mSearch.getText().toString();
        setContentView(R.layout.select);

        TextView myText = (TextView) findViewById(R.id.textView4);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);


        TextView myTextBack = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 " + job + " positions.");

        TextView myText1 = (TextView) findViewById(R.id.buttonjob1);
        TextView myText2 = (TextView) findViewById(R.id.buttonjob2);
        TextView myText3 = (TextView) findViewById(R.id.buttonjob3);
        TextView myText4 = (TextView) findViewById(R.id.buttonjob4);
        TextView myText5 = (TextView) findViewById(R.id.buttonjob5);
        TextView myText6 = (TextView) findViewById(R.id.buttonjob6);
        TextView myText7 = (TextView) findViewById(R.id.buttonjob7);
        TextView myText8 = (TextView) findViewById(R.id.buttonjob8);

        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);
        myText4.setTypeface(myFont2);
        myText5.setTypeface(myFont2);
        myText6.setTypeface(myFont2);
        myText7.setTypeface(myFont2);
        myText8.setTypeface(myFont2);

        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 for " + job + " position");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 for " + job + " position");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 for " + job + " position");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 for " + job + " position");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 for " + job + " position");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 for " + job + " position");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 for " + job + " position");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 for " + job + " position");


    }
    public void onClickAllResultsE(View v){

        employer = mEmployer.getText().toString();
        setContentView(R.layout.select_employer);

        TextView myText = (TextView) findViewById(R.id.textView4);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 jobs with the " + employer + " company.");

        TextView myText1 = (TextView) findViewById(R.id.buttonjob1);
        TextView myText2 = (TextView) findViewById(R.id.buttonjob2);
        TextView myText3 = (TextView) findViewById(R.id.buttonjob3);
        TextView myText4 = (TextView) findViewById(R.id.buttonjob4);
        TextView myText5 = (TextView) findViewById(R.id.buttonjob5);
        TextView myText6 = (TextView) findViewById(R.id.buttonjob6);
        TextView myText7 = (TextView) findViewById(R.id.buttonjob7);
        TextView myText8 = (TextView) findViewById(R.id.buttonjob8);

        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);
        myText4.setTypeface(myFont2);
        myText5.setTypeface(myFont2);
        myText6.setTypeface(myFont2);
        myText7.setTypeface(myFont2);
        myText8.setTypeface(myFont2);

        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + employer );
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + employer );
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + employer );
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + employer );
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + employer  );
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + employer  );
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + employer  );
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + employer);


    }

    public void onClickAllResultsT(View v){
        tags = mTag.getText().toString();
        setContentView(R.layout.select_tags);

        TextView myText = (TextView) findViewById(R.id.textView4);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 positions with " + tags + " tags.");

        TextView myText1 = (TextView) findViewById(R.id.buttonjob1);
        TextView myText2 = (TextView) findViewById(R.id.buttonjob2);
        TextView myText3 = (TextView) findViewById(R.id.buttonjob3);
        TextView myText4 = (TextView) findViewById(R.id.buttonjob4);
        TextView myText5 = (TextView) findViewById(R.id.buttonjob5);
        TextView myText6 = (TextView) findViewById(R.id.buttonjob6);
        TextView myText7 = (TextView) findViewById(R.id.buttonjob7);
        TextView myText8 = (TextView) findViewById(R.id.buttonjob8);

        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);
        myText4.setTypeface(myFont2);
        myText5.setTypeface(myFont2);
        myText6.setTypeface(myFont2);
        myText7.setTypeface(myFont2);
        myText8.setTypeface(myFont2);

        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + tags + " tags");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + tags + " tags");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + tags+ " tags");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + tags+ " tags");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + tags+ " tags");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + tags+ " tags");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + tags+ " tags");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + tags + " tags");


    }

    public void onClickReturntoSearch(View v){

        setContentView(R.layout.search2);
        TextView myText = (TextView) findViewById(R.id.textView47);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myText1 = (TextView) findViewById(R.id.editPosition);
        TextView myText2 = (TextView) findViewById(R.id.editEmployer);
        TextView myText3 = (TextView) findViewById(R.id.editTags);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);


        TextView myTextBack = (TextView) findViewById(R.id.button18);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

    }

    public void onClickByPosition(View v) {
        mSearch = (EditText) findViewById(R.id.editPosition);
        job = mSearch.getText().toString();
        type = "position";
        setContentView(R.layout.select);
        TextView myText = (TextView) findViewById(R.id.textView4);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 " + job + " positions.");

        TextView myText1 = (TextView) findViewById(R.id.buttonjob1);
        TextView myText2 = (TextView) findViewById(R.id.buttonjob2);
        TextView myText3 = (TextView) findViewById(R.id.buttonjob3);
        TextView myText4 = (TextView) findViewById(R.id.buttonjob4);
        TextView myText5 = (TextView) findViewById(R.id.buttonjob5);
        TextView myText6 = (TextView) findViewById(R.id.buttonjob6);
        TextView myText7 = (TextView) findViewById(R.id.buttonjob7);
        TextView myText8 = (TextView) findViewById(R.id.buttonjob8);

        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);
        myText4.setTypeface(myFont2);
        myText5.setTypeface(myFont2);
        myText6.setTypeface(myFont2);
        myText7.setTypeface(myFont2);
        myText8.setTypeface(myFont2);

        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 for " + job + " position");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 for " + job + " position");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 for " + job + " position");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 for " + job + " position");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 for " + job + " position");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 for " + job + " position");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 for " + job + " position");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 for " + job + " position");
    }


    public void onClickByEmployer(View v) {
        mEmployer = (EditText) findViewById(R.id.editEmployer);
        employer = mEmployer.getText().toString();
        type = "employer";
        setContentView(R.layout.select_employer);
        TextView myText = (TextView) findViewById(R.id.textView4);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 jobs with the " + employer + " company.");

        TextView myText1 = (TextView) findViewById(R.id.buttonjob1);
        TextView myText2 = (TextView) findViewById(R.id.buttonjob2);
        TextView myText3 = (TextView) findViewById(R.id.buttonjob3);
        TextView myText4 = (TextView) findViewById(R.id.buttonjob4);
        TextView myText5 = (TextView) findViewById(R.id.buttonjob5);
        TextView myText6 = (TextView) findViewById(R.id.buttonjob6);
        TextView myText7 = (TextView) findViewById(R.id.buttonjob7);
        TextView myText8 = (TextView) findViewById(R.id.buttonjob8);

        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);
        myText4.setTypeface(myFont2);
        myText5.setTypeface(myFont2);
        myText6.setTypeface(myFont2);
        myText7.setTypeface(myFont2);
        myText8.setTypeface(myFont2);

        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + employer );
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + employer );
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + employer );
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + employer );
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + employer  );
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + employer  );
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + employer  );
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + employer);
    }

    public void onClickByTags(View v) {
        mTag = (EditText) findViewById(R.id.editTags);
        tags = mTag.getText().toString();
        setContentView(R.layout.select_tags);
        type = "tag";
        TextView myText = (TextView) findViewById(R.id.textView4);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 positions with " + tags + " tags.");

        TextView myText1 = (TextView) findViewById(R.id.buttonjob1);
        TextView myText2 = (TextView) findViewById(R.id.buttonjob2);
        TextView myText3 = (TextView) findViewById(R.id.buttonjob3);
        TextView myText4 = (TextView) findViewById(R.id.buttonjob4);
        TextView myText5 = (TextView) findViewById(R.id.buttonjob5);
        TextView myText6 = (TextView) findViewById(R.id.buttonjob6);
        TextView myText7 = (TextView) findViewById(R.id.buttonjob7);
        TextView myText8 = (TextView) findViewById(R.id.buttonjob8);

        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);
        myText4.setTypeface(myFont2);
        myText5.setTypeface(myFont2);
        myText6.setTypeface(myFont2);
        myText7.setTypeface(myFont2);
        myText8.setTypeface(myFont2);

        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + tags + " tags");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + tags + " tags");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + tags+ " tags");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + tags+ " tags");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + tags+ " tags");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + tags+ " tags");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + tags+ " tags");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + tags+ " tags");
    }
    public void onJ1(View v) {
        num = 1;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ2(View v){
        num = 2;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ3(View v){
        num = 3;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ4(View v){
        num = 4;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ5(View v){
        num = 5;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ6(View v){
        num = 6;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ7(View v){
        num = 7;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ8(View v){
        num = 8;
        if (type.equals("position")) {
            onClickApplyP(v);
        } else if (type.equals("employer")) {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onClickCancel(View v){
        if (type.equals("position")) {
            onClickAllResultsP(v);
        } else if (type.equals("employer")) {
            onClickAllResultsE(v);
        } else { //type = tag
            onClickAllResultsT(v);
        }
    }

    public void onOKAY(View v){
        Context context = getApplicationContext();
        CharSequence text = "Congratulations! You have sucessfully applied to Job"+ num ;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        if (type.equals("position")) {
            onClickAllResultsP(v);
        } else if (type.equals("employer")) {
            onClickAllResultsE(v);
        } else { //type = tag
            onClickAllResultsT(v);
        }
    }

    public void onClickResume(View v){
        setContentView(R.layout.resume);
        Spinner resumes = (Spinner)findViewById(R.id.spinner1);


        String[] items = new String[]{"Education", "Business", "CS", "EE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        assert resumes != null;
        resumes.setAdapter(adapter);

        Spinner otherDocs = (Spinner)findViewById(R.id.spinner2);
        String[] items2 = new String[]{"Cover Letter-General", "References"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        assert otherDocs != null;
        otherDocs.setAdapter(adapter2);


        TextView myText1 = (TextView) findViewById(R.id.textView6);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText1.setTypeface(myFont2);

        TextView myOr1 = (TextView) findViewById(R.id.textView32);
        TextView myOr2 = (TextView) findViewById(R.id.textView33);
        TextView mySelect = (TextView) findViewById(R.id.textView35);
        TextView myChoose = (TextView) findViewById(R.id.textView36);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myOr1.setTypeface(myFont3);
        myOr2.setTypeface(myFont3);
        mySelect.setTypeface(myFont3);
        myChoose.setTypeface(myFont3);

        Typeface myFont1 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");

        TextView mySub = (TextView) findViewById(R.id.button14);
        TextView myCancel = (TextView) findViewById(R.id.button16);
        TextView myUp1 = (TextView) findViewById(R.id.button12);
        TextView myUp2 = (TextView) findViewById(R.id.button13);

        mySub.setTypeface(myFont1);
        myCancel.setTypeface(myFont1);
        myUp1.setTypeface(myFont1);
        myUp2.setTypeface(myFont1);


        if (type.equals("position")){
            final TextView viewing1 = (TextView) findViewById(R.id.textView6);
            String text = "You are applying to Job" + num + " for " +job + " positon.";
            assert viewing1 != null;
            viewing1.setText(text);

        } else if (type.equals("employer")){
            final TextView viewing1 = (TextView) findViewById(R.id.textView6);
            String text = "You are applying to Job" + num+ " with " + employer +".";
            assert viewing1 != null;
            viewing1.setText(text);

        }else{ //type == tag
            final TextView viewing1 = (TextView) findViewById(R.id.textView6);
            String text = "You are applying to Job" +num + " with " + tags + " tags.";
            assert viewing1 != null;
            viewing1.setText(text);

        }
    }
public void onClickUploadRes(View v){
    Intent myIntent = new Intent(JobSeeker.this, Resume.class);
    startActivity(myIntent);
}

    public void onClickJobSeeker(View v){
        setContentView(R.layout.jobseeker);
        TextView myText = (TextView) findViewById(R.id.textView);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myText1 = (TextView) findViewById(R.id.button);
        TextView myText2 = (TextView) findViewById(R.id.button3);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button15);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
    }

}

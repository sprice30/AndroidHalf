package com.example.samprice.applytojob;

import android.content.Intent;
import android.graphics.Typeface;
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
ArrayList<String> jobs = new ArrayList<String>();
    ArrayList<String> dest = new ArrayList<String>();
    ArrayList<String> location = new ArrayList<String>();
    ArrayList<String> salary = new ArrayList<String>();
    int curr;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.view1);
        viewJobsPosted();
        TextView myText = (TextView) findViewById(R.id.textView38);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);


        TextView myTextBack = (TextView) findViewById(R.id.button17);
        TextView myTextCancel = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextCancel.setTypeface(myFont3);

    }

    public void viewJobsPosted(){

        Bundle titleList = getIntent().getExtras();
        jobs = titleList.getStringArrayList("titleList");
        dest = titleList.getStringArrayList("des");
        location = titleList.getStringArrayList("loca");
        salary = titleList.getStringArrayList("sal");


        if (jobs.size()>0){
        job1 = jobs.get(0);
        } else{
            job1 = "";
        }
        if (jobs.size()>1){
            job2 = jobs.get(1);
        } else{
            job2 = "";
        }
        if (jobs.size()>2){
            job3 = jobs.get(2);
        } else{
            job3 = "";
        }
        if (jobs.size()>3){
            job4 = jobs.get(3);
        } else{
            job4 = "";
        }

        setContentView(R.layout.view1);

        TextView myText = (TextView) findViewById(R.id.textView38);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);


        TextView myTextBack = (TextView) findViewById(R.id.button17);
        TextView myTextCancel = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextCancel.setTypeface(myFont3);



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
    bundle.putStringArrayList("titleList", jobs);
    bundle.putStringArrayList("des", dest);
    bundle.putStringArrayList("loca", location);
    bundle.putStringArrayList("sal", salary);
    //bundle.putInt("Current", curr);
    myIntent.putExtras(bundle);

    startActivity(myIntent);

}
    public void onClickBack(View v){

        setContentView(R.layout.view1);
        TextView myText = (TextView) findViewById(R.id.textView38);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);


        TextView myTextBack = (TextView) findViewById(R.id.button17);
        TextView myTextCancel = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextCancel.setTypeface(myFont3);

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

    TextView myText = (TextView) findViewById(R.id.textView40);
    Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
    myText.setTypeface(myFont);

    TextView myText1 = (TextView) findViewById(R.id.button21);
    TextView myText2 = (TextView) findViewById(R.id.button22);
    TextView myText3 = (TextView) findViewById(R.id.button23);
    TextView myText4 = (TextView) findViewById(R.id.button24);
    TextView myText5 = (TextView) findViewById(R.id.button25);
    Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
    myText1.setTypeface(myFont2);
    myText2.setTypeface(myFont2);
    myText3.setTypeface(myFont2);
    myText4.setTypeface(myFont2);
    myText5.setTypeface(myFont2);

    TextView myTextBack = (TextView) findViewById(R.id.button16);
    Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
    myTextBack.setTypeface(myFont3);

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

        TextView myText = (TextView) findViewById(R.id.textView40);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myText1 = (TextView) findViewById(R.id.button21);
        TextView myText2 = (TextView) findViewById(R.id.button22);
        TextView myText3 = (TextView) findViewById(R.id.button23);
        TextView myText4 = (TextView) findViewById(R.id.button24);
        TextView myText5 = (TextView) findViewById(R.id.button25);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);
        myText4.setTypeface(myFont2);
        myText5.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView40);
        String text = "Viewing Applicants for " + jobSelected + " Job.";

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

        TextView myText = (TextView) findViewById(R.id.textView41);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myText1 = (TextView) findViewById(R.id.button27);
        TextView myText2 = (TextView) findViewById(R.id.button28);
        TextView myText3 = (TextView) findViewById(R.id.button29);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myText1.setTypeface(myFont2);
        myText2.setTypeface(myFont2);
        myText3.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView41);
        viewing1.setText("Viewing Documents for Applicant " + num + ".");
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
        TextView myText = (TextView) findViewById(R.id.textView42);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView42);
        viewing1.setText("Viewing Resume for " + num + ".");
    }

    public void onClickViewOther(View v){
        setContentView(R.layout.view_other);

        TextView myText = (TextView) findViewById(R.id.textView44);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView44);
        viewing1.setText("Viewing Other Documents for " + num + ".");
    }

    public void onClickViewTags(View v){
        setContentView(R.layout.view_tags);
        TextView myText = (TextView) findViewById(R.id.textView45);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTextBack = (TextView) findViewById(R.id.button16);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);

        final TextView viewing1 = (TextView) findViewById(R.id.textView45);
        viewing1.setText("Viewing Matching Tags for " + num + ".");
    }



    public void onClickBack2(View v){
        onClickNum();

    }

}

package com.example.samprice.applytojob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.samprice.applytojob.R;

import java.util.ArrayList;

public class AddingJob extends AppCompatActivity {
    public EditText JT,JD,L,S;

    public String title = "",title2 = "",title3 = "",title4 = "" , des, loc, sal;
    public int one = 0,two = 0,three = 0, four = 0;
    public int check = 0, check2 = 0, check3= 0, check4 = 0;
    public int back = -1;



    public void onButtonClickPost(View v){
        JT = (EditText) findViewById(R.id.editTextjobTitle);
        JD = (EditText) findViewById(R.id.editTextDes);
        L = (EditText) findViewById(R.id.editTextLoc);
        S = (EditText) findViewById(R.id.editTextSal);

        Bundle titles = getIntent().getExtras();
        title = titles.getString("jobTitle1");
        title2 = titles.getString("jobTitle2");
        title3 = titles.getString("jobTitle3");
        title4 = titles.getString("jobTitle4");

        if(title == null) {
            title = JT.getText().toString();
            back = 1;
            one = 1;
        }
        else if(title2 == null){
            title2 = JT.getText().toString();
            back =2;
            two = 1;
        }
        else if(title3 == null){
            back = 3;
            title3 = JT.getText().toString();
            three = 1;

        }
        else {
            title4 = JT.getText().toString();
            four = 1;
           back = 4;
        }
        des = JD.getText().toString();
        loc = L.getText().toString();
        sal = S.getText().toString();

        setContentView(R.layout.paj2);
        if(one == 1 && two == 0) {
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title);
            check = 1;
        }
        else if(two == 1 && three == 0){
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title2);
            check2 = 1;
        }
        else if(three == 1 && four == 0){
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title3);
            check3 = 1;
        }
        else{
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title4);
            check4 = 1;
        }

        final TextView m1 = (TextView) findViewById(R.id.textViewpaste2);
        m1.setText(des);
        final TextView m2 = (TextView) findViewById(R.id.textViewpaste3);
        m2.setText(" " + loc);
        final TextView m3 = (TextView) findViewById(R.id.textViewpaste4);
        m3.setText(" " + sal);
        }
        public void onButtonClickConfirm(View v) {
            setContentView(R.layout.paj3);


            if(check == 1 && check2 == 0) {
                final TextView m = (TextView) findViewById(R.id.c1);
                m.setText(title);
            }
            else if(check2 == 1 && check3 == 0){
                final TextView m = (TextView) findViewById(R.id.c1);
                m.setText(title);

                final TextView m2 = (TextView) findViewById(R.id.c2);
                m2.setText(title2);
            }
            else if(check3 == 1 && check4 == 0){
                final TextView m = (TextView) findViewById(R.id.c1);
                m.setText(title);
                final TextView m2 = (TextView) findViewById(R.id.c2);
                m2.setText(title2);
                final TextView m3 = (TextView) findViewById(R.id.c3);
                m3.setText(title3);
            }
            else{
                final TextView m = (TextView) findViewById(R.id.c1);
                m.setText(title);
                final TextView m2 = (TextView) findViewById(R.id.c2);
                m2.setText(title2);
                final TextView m3 = (TextView) findViewById(R.id.c3);
                m3.setText(title3);
                final TextView m4 = (TextView) findViewById(R.id.c4);
                m4.setText(title4);
            }
        }
           public void onButtonClickBack(View v) {
             /*    if (back == 1) {
                    title = "";
                }
                else if(back == 2){
                    title2 = "";
                }
                else if(back == 3){
                    title3 = "";
                }
                else{
                    title4 = "";
                }*/
             setContentView(R.layout.paj1);

         }
    public void onButtonPostNew(View v){
        setContentView(R.layout.paj1);
    }

            public void onButtonClickDelete1(View v){
                final TextView m = (TextView) findViewById(R.id.c1);
                m.setText("Job Deleted");

                title = title2;
                title2 = title3;
                title3 = title4;
                four = 0;
                check4 = 0;
            }
        public void onButtonClickDelete2(View v){
             final TextView m = (TextView) findViewById(R.id.c2);
             m.setText("Job Deleted");
            title2 = title3;
            title3 = title4;
            four = 0;
            check4 =0;

        }
        public void onButtonClickDelete3(View v){
             final TextView m = (TextView) findViewById(R.id.c3);
              m.setText("Job Deleted");
            title3 = title4;
            title4="";
            four = 0;
            check4 = 0;
        }
        public void onButtonClickDelete4(View v) {
            final TextView m = (TextView) findViewById(R.id.c4);
            m.setText("Job Deleted");
            title4 = "";
            four = 0;
            check4 = 0;
        }

public void onClickEmployer1(View v){
    Intent myIntent = new Intent(AddingJob.this, Employer.class);
    Bundle bundle = new Bundle();
    bundle.putString("jobTitle1", title);
    bundle.putString("jobTitle2", title2);
    bundle.putString("jobTitle3", title3);
    bundle.putString("jobTitle4", title4);
     myIntent.putExtras(bundle);
    startActivity(myIntent);
}
    public void onClickActMain(View v){
        Intent myIntent = new Intent(AddingJob.this, MainActivity.class);
        startActivity(myIntent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paj1);



    }




}

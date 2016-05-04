package com.example.samprice.applytojob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.samprice.applytojob.R;

import java.util.ArrayList;

public class AddingJob extends AppCompatActivity {
    public EditText JT,JD,L,S;

    ArrayList<String> title = new ArrayList<String>();
    ArrayList<String> dest = new ArrayList<String>();
    ArrayList<String> location = new ArrayList<String>();
    ArrayList<String> salary = new ArrayList<String>();


    public int current;

    public void onButtonClickPost(View v){
        JT = (EditText) findViewById(R.id.editTextjobTitle);
        JD = (EditText) findViewById(R.id.editTextDes);
        L = (EditText) findViewById(R.id.editTextLoc);
        S = (EditText) findViewById(R.id.editTextSal);

        current = title.size();

        title.add(JT.getText().toString());
        dest.add(JD.getText().toString());
        location.add(JD.getText().toString());
        salary.add(S.getText().toString());
        setContentView(R.layout.paj2);

        if(current == 0) {
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title.get(0));
            final TextView m1 = (TextView) findViewById(R.id.textViewpaste2);
            m1.setText(dest.get(0));
            final TextView m2 = (TextView) findViewById(R.id.textViewpaste3);
            m2.setText(" " + location.get(0));
            final TextView m3 = (TextView) findViewById(R.id.textViewpaste4);
            m3.setText(" " + salary.get(0));
            current++;
        }
        else if(current == 1){
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title.get(1));
            final TextView m1 = (TextView) findViewById(R.id.textViewpaste2);
            m1.setText(dest.get(1));
            final TextView m2 = (TextView) findViewById(R.id.textViewpaste3);
            m2.setText(" " + location.get(1));
            final TextView m3 = (TextView) findViewById(R.id.textViewpaste4);
            m3.setText(" " + salary.get(1));
            current++;

        }
        else if(current == 2){
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title.get(2));
            final TextView m1 = (TextView) findViewById(R.id.textViewpaste2);
            m1.setText(dest.get(2));
            final TextView m2 = (TextView) findViewById(R.id.textViewpaste3);
            m2.setText(" " + location.get(2));
            final TextView m3 = (TextView) findViewById(R.id.textViewpaste4);
            m3.setText(" " + salary.get(2));
            current++;

        }
        else if(current == 3) {
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title.get(3));
            final TextView m1 = (TextView) findViewById(R.id.textViewpaste2);
            m1.setText(dest.get(3));
            final TextView m2 = (TextView) findViewById(R.id.textViewpaste3);
            m2.setText(" " + location.get(3));
            final TextView m3 = (TextView) findViewById(R.id.textViewpaste4);
            m3.setText(" " + salary.get(3));
            current++;
        }
        else{
            title.remove(3);
            dest.remove(3);
            location.remove(3);
            salary.remove(3);
            final TextView m = (TextView) findViewById(R.id.textViewpaste);
            m.setText(" " + title.get(3));
            final TextView m1 = (TextView) findViewById(R.id.textViewpaste2);
            m1.setText(dest.get(3));
            final TextView m2 = (TextView) findViewById(R.id.textViewpaste3);
            m2.setText(" " + location.get(3));
            final TextView m3 = (TextView) findViewById(R.id.textViewpaste4);
            m3.setText(" " + salary.get(3));


        }
    }

    public void onButtonClickConfirm(View v) {
        setContentView(R.layout.paj3);
        if(title.size()==1) {
            final TextView m = (TextView) findViewById(R.id.c1);
            m.setText(title.get(0));
        }
        else if(title.size()==2){
            final TextView m = (TextView) findViewById(R.id.c1);
            m.setText(title.get(0));
            final TextView m2 = (TextView) findViewById(R.id.c2);
            m2.setText(title.get(1));
        }
        else if(title.size()==3){
            final TextView m = (TextView) findViewById(R.id.c1);
            m.setText(title.get(0));
            final TextView m2 = (TextView) findViewById(R.id.c2);
            m2.setText(title.get(1));
            final TextView m3 = (TextView) findViewById(R.id.c3);
            m3.setText(title.get(2));

        }
        else{
            final TextView m = (TextView) findViewById(R.id.c1);
            m.setText(title.get(0));
            final TextView m2 = (TextView) findViewById(R.id.c2);
            m2.setText(title.get(1));
            final TextView m3 = (TextView) findViewById(R.id.c3);
            m3.setText(title.get(2));
            final TextView m4 = (TextView) findViewById(R.id.c4);
            m4.setText(title.get(3));
        }
    }
    public void onButtonClickBack(View v) {
        setContentView(R.layout.paj1);
    }

    public void onButtonClickDelete1(View v) {
        if (title.size() > 0){
            final TextView m = (TextView) findViewById(R.id.c1);
            m.setText("Job Deleted");
            title.remove(0);
            dest.remove(0);
            location.remove(0);
            salary.remove(0);
            current--;
        }
    }
    public void onButtonClickDelete2(View v){
        if (title.size() > 1) {
            final TextView m = (TextView) findViewById(R.id.c2);
            m.setText("Job Deleted");
            title.remove(1);
            dest.remove(1);
            location.remove(1);
            salary.remove(1);
            current--;
        }
    }
    public void onButtonClickDelete3(View v){
        if (title.size() > 2) {
            final TextView m = (TextView) findViewById(R.id.c3);
            m.setText("Job Deleted");
            title.remove(2);
            dest.remove(2);
            location.remove(2);
            salary.remove(2);
            current--;
        }
    }
    public void onButtonClickDelete4(View v) {
        if (title.size() > 3) {
            final TextView m = (TextView) findViewById(R.id.c4);
            m.setText("Job Deleted");
            title.remove(3);
            dest.remove(3);
            location.remove(3);
            salary.remove(3);
            current--;
        }
    }

    public void onButtonPostNew(View v){
        setContentView(R.layout.paj1);
    }

public void onClickEmployer1(View v){
    Intent myIntent = new Intent(AddingJob.this, Employer.class);

    Bundle bundle = new Bundle();
    bundle.putStringArrayList("titleList", title);
    bundle.putStringArrayList("des", dest);
    bundle.putStringArrayList("loca", location);
    bundle.putStringArrayList("sal", salary);
   // bundle.putInt("Current", current);
    myIntent.putExtras(bundle);

    startActivity(myIntent);
}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paj1);


        Bundle titleList = getIntent().getExtras();
        title = titleList.getStringArrayList("titleList");
        dest = titleList.getStringArrayList("des");
        location = titleList.getStringArrayList("loca");
        salary = titleList.getStringArrayList("sal");

      //  current = titleList.getInt("Current");

    }




}

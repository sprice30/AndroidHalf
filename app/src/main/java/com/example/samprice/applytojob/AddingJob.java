package com.example.samprice.applytojob;

import android.content.Intent;
import android.graphics.Typeface;
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

        TextView myText = (TextView) findViewById(R.id.textView);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTitle = (TextView) findViewById(R.id.textView2);
        TextView myTitle2 = (TextView) findViewById(R.id.textViewpaste);
        TextView myDes = (TextView) findViewById(R.id.textView3);
        TextView myDes2 = (TextView) findViewById(R.id.textViewpaste2);
        TextView myLoca = (TextView) findViewById(R.id.textView4);
        TextView myLoca2 = (TextView) findViewById(R.id.textViewpaste3);
        TextView mySal = (TextView) findViewById(R.id.textView53);
        TextView mySal2 = (TextView) findViewById(R.id.textViewpaste4);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myTitle.setTypeface(myFont2);
        myTitle2.setTypeface(myFont2);
        myDes.setTypeface(myFont2);
        myDes2.setTypeface(myFont2);
        myLoca.setTypeface(myFont2);
        myLoca2.setTypeface(myFont2);
        mySal.setTypeface(myFont2);
        mySal2.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button2);
        TextView myTextPost = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextPost.setTypeface(myFont3);

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

        TextView myText = (TextView) findViewById(R.id.textView);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTitle = (TextView) findViewById(R.id.c1);
        TextView myTitle2 = (TextView) findViewById(R.id.button4);
        TextView myDes = (TextView) findViewById(R.id.c2);
        TextView myDes2 = (TextView) findViewById(R.id.button5);
        TextView myLoca = (TextView) findViewById(R.id.c3);
        TextView myLoca2 = (TextView) findViewById(R.id.button6);
        TextView mySal = (TextView) findViewById(R.id.c4);
        TextView mySal2 = (TextView) findViewById(R.id.button7);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myTitle.setTypeface(myFont2);
        myTitle2.setTypeface(myFont2);
        myDes.setTypeface(myFont2);
        myDes2.setTypeface(myFont2);
        myLoca.setTypeface(myFont2);
        myLoca2.setTypeface(myFont2);
        mySal.setTypeface(myFont2);
        mySal2.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button8);
        TextView myTextPost = (TextView) findViewById(R.id.button3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextPost.setTypeface(myFont3);

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

        TextView myText = (TextView) findViewById(R.id.textView);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTitle = (TextView) findViewById(R.id.textView2);
        TextView myTitle2 = (TextView) findViewById(R.id.editTextjobTitle);
        TextView myDes = (TextView) findViewById(R.id.textView3);
        TextView myDes2 = (TextView) findViewById(R.id.editTextDes);
        TextView myLoca = (TextView) findViewById(R.id.textView4);
        TextView myLoca2 = (TextView) findViewById(R.id.editTextLoc);
        TextView mySal = (TextView) findViewById(R.id.textView5);
        TextView mySal2 = (TextView) findViewById(R.id.editTextSal);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myTitle.setTypeface(myFont2);
        myTitle2.setTypeface(myFont2);
        myDes.setTypeface(myFont2);
        myDes2.setTypeface(myFont2);
        myLoca.setTypeface(myFont2);
        myLoca2.setTypeface(myFont2);
        mySal.setTypeface(myFont2);
        mySal2.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button15);
        TextView myTextPost = (TextView) findViewById(R.id.button);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextPost.setTypeface(myFont3);
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

        TextView myText = (TextView) findViewById(R.id.textView);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTitle = (TextView) findViewById(R.id.textView2);
        TextView myTitle2 = (TextView) findViewById(R.id.editTextjobTitle);
        TextView myDes = (TextView) findViewById(R.id.textView3);
        TextView myDes2 = (TextView) findViewById(R.id.editTextDes);
        TextView myLoca = (TextView) findViewById(R.id.textView4);
        TextView myLoca2 = (TextView) findViewById(R.id.editTextLoc);
        TextView mySal = (TextView) findViewById(R.id.textView5);
        TextView mySal2 = (TextView) findViewById(R.id.editTextSal);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myTitle.setTypeface(myFont2);
        myTitle2.setTypeface(myFont2);
        myDes.setTypeface(myFont2);
        myDes2.setTypeface(myFont2);
        myLoca.setTypeface(myFont2);
        myLoca2.setTypeface(myFont2);
        mySal.setTypeface(myFont2);
        mySal2.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button15);
        TextView myTextPost = (TextView) findViewById(R.id.button);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextPost.setTypeface(myFont3);

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

        TextView myText = (TextView) findViewById(R.id.textView);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/BBLight.ttf");
        myText.setTypeface(myFont);

        TextView myTitle = (TextView) findViewById(R.id.textView2);
        TextView myTitle2 = (TextView) findViewById(R.id.editTextjobTitle);
        TextView myDes = (TextView) findViewById(R.id.textView3);
        TextView myDes2 = (TextView) findViewById(R.id.editTextDes);
        TextView myLoca = (TextView) findViewById(R.id.textView4);
        TextView myLoca2 = (TextView) findViewById(R.id.editTextLoc);
        TextView mySal = (TextView) findViewById(R.id.textView5);
        TextView mySal2 = (TextView) findViewById(R.id.editTextSal);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/BrookeS8.ttf");
        myTitle.setTypeface(myFont2);
        myTitle2.setTypeface(myFont2);
        myDes.setTypeface(myFont2);
        myDes2.setTypeface(myFont2);
        myLoca.setTypeface(myFont2);
        myLoca2.setTypeface(myFont2);
        mySal.setTypeface(myFont2);
        mySal2.setTypeface(myFont2);

        TextView myTextBack = (TextView) findViewById(R.id.button15);
        TextView myTextPost = (TextView) findViewById(R.id.button);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        myTextBack.setTypeface(myFont3);
        myTextPost.setTypeface(myFont3);

    }




}

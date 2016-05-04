package com.example.samprice.applytojob;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RemoteViews;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.samprice.applytojob.R;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{ //implements OnItemSelectedListener {

ArrayList<String> titles = new ArrayList<String>();
    ArrayList<String> dest = new ArrayList<String>();
    ArrayList<String> location = new ArrayList<String>();
    ArrayList<String> salary = new ArrayList<String>();
    int currNum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }



    public void onClickEmployer(View v) {
        Intent myIntent = new Intent(MainActivity.this, Employer.class);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("titleList", titles);
        bundle.putStringArrayList("des", dest);
        bundle.putStringArrayList("loca", location);
        bundle.putStringArrayList("sal", salary);
       // bundle.putInt("Current", currNum);
        myIntent.putExtras(bundle);
       startActivity(myIntent);
    }

    public void onClickJobSeeker(View v) {
        Intent myIntent = new Intent(MainActivity.this, JobSeeker.class);
        startActivity(myIntent);
    }




}


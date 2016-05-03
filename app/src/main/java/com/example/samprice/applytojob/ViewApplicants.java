package com.example.samprice.applytojob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by samprice on 5/2/16.
 */
public class ViewApplicants extends AppCompatActivity {
   String jobSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.view1);

       AddingJob titles = new AddingJob();


        final Spinner jobsPosted = (Spinner) findViewById(R.id.spinner1);
        String[] items = new String[]{titles.getJob1(), titles.getJob2(), titles.getJob3(), titles.getJob4()};
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
public void onClickCancel(View v){
    Intent myIntent = new Intent(ViewApplicants.this, Employer.class);
    startActivity(myIntent);

}

    public void onClickApplicants(View v){
        Employer jobChosen = new Employer();


        final TextView viewing1 = (TextView) findViewById(R.id.textView40);
        viewing1.setText("Viewing " + jobSelected + " job.");

    }


}

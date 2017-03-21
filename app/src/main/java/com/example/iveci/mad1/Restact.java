package com.example.iveci.mad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.TimePicker;

public class Restact extends AppCompatActivity {
    Switch s1;
    Button b1,b2;
    DatePicker d1;
    TimePicker t1;
    Chronometer ch1;
    EditText e1,e2,e3;
    GridLayout g1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("레스토랑 예약시스템");
        setContentView(R.layout.activity_restact);
        init();
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                d1.setVisibility(View.VISIBLE);
                ch1.setVisibility(View.VISIBLE);
                ch1.getDrawingTime();
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
            }
        });

    }

    public void resClick(View v){
        if (v.getId() == R.id.bprev) {

        }

        else if (v.getId() == R.id.bnext) {

        }
    }

    public void init(){
        s1 = (Switch) findViewById(R.id.start);
        b1 = (Button) findViewById(R.id.bprev);
        b2 = (Button) findViewById(R.id.bnext);
        d1 = (DatePicker) findViewById(R.id.datePicker2);
        t1 = (TimePicker) findViewById(R.id.timePicker);
        ch1 = (Chronometer) findViewById(R.id.chronometer3);
        e1 = (EditText) findViewById(R.id.eadult);
        e2 = (EditText) findViewById(R.id.eteen);
        e3 = (EditText) findViewById(R.id.echild);
        g1 = (GridLayout) findViewById(R.id.glresult);

    }
}

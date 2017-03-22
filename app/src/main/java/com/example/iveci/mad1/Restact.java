package com.example.iveci.mad1;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

public class Restact extends AppCompatActivity {
    Switch s1;
    Button b1,b2;
    DatePicker d1;
    TimePicker t1;
    Chronometer ch1;
    EditText e1,e2,e3;
    FrameLayout f1;
    GridLayout g1,g2;
    TextView v1,v2,v3,v4,v5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("레스토랑 예약시스템");
        setContentView(R.layout.activity_restact);
        init();
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    f1.setVisibility(View.VISIBLE);
                    ch1.setVisibility(View.VISIBLE);
                    ch1.setBase(SystemClock.elapsedRealtime());
                    ch1.start();
                    t1.getBaseline();
                    b1.setVisibility(View.VISIBLE);
                    b1.setEnabled(false);
                    b2.setVisibility(View.VISIBLE);
                }
                else {
                    f1.setVisibility(View.INVISIBLE);
                    ch1.setVisibility(View.INVISIBLE);
                    ch1.stop();
                    d1.setVisibility(View.VISIBLE);
                    g1.setVisibility(View.INVISIBLE);
                    g2.setVisibility(View.INVISIBLE);
                    t1.setVisibility(View.INVISIBLE);
                    b1.setVisibility(View.INVISIBLE);
                    b2.setVisibility(View.INVISIBLE);
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    b2.setEnabled(true);
                }
            }
        });

    }

    public void resClick(View v){
        if (v.getId() == R.id.bprev) {
            if (g2.getVisibility() == View.VISIBLE) {
                g2.setVisibility(View.INVISIBLE);
                g1.setVisibility(View.VISIBLE);
                b2.setEnabled(true);
            }
            else if (g1.getVisibility() == View.VISIBLE) {
                g1.setVisibility(View.INVISIBLE);
                t1.setVisibility(View.VISIBLE);
            }
            else if (t1.getVisibility() == View.VISIBLE) {
                t1.setVisibility(View.INVISIBLE);
                d1.setVisibility(View.VISIBLE);
                b1.setEnabled(false);
            }
        }

        else if (v.getId() == R.id.bnext) {
            if (d1.getVisibility() == View.VISIBLE) {
                d1.setVisibility(View.INVISIBLE);
                t1.setVisibility(View.VISIBLE);
                b1.setEnabled(true);
            }
            else if (t1.getVisibility() == View.VISIBLE) {
                t1.setVisibility(View.INVISIBLE);
                g1.setVisibility(View.VISIBLE);
            }
            else if (g1.getVisibility() == View.VISIBLE) {
                v1.setText(String.format("%d년 %d월 %d일",d1.getYear(),d1.getMonth()+1,d1.getDayOfMonth()));
                v2.setText(String.format("%d시 %d분",t1.getHour(),t1.getMinute()));
                v3.setText(e1.getText().toString().equals("") ? "0명" : e1.getText().toString()+"명");
                v4.setText(e2.getText().toString().equals("") ? "0명" : e2.getText().toString()+"명");
                v5.setText(e3.getText().toString().equals("") ? "0명" : e3.getText().toString()+"명");
                g1.setVisibility(View.INVISIBLE);
                g2.setVisibility(View.VISIBLE);
                b2.setEnabled(false);
            }
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
        g1 = (GridLayout) findViewById(R.id.glval);
        g2 = (GridLayout) findViewById(R.id.glresult);
        f1 = (FrameLayout) findViewById(R.id.mainframe);
        v1 = (TextView) findViewById(R.id.tday);
        v2 = (TextView) findViewById(R.id.ttime);
        v3 = (TextView) findViewById(R.id.tadult);
        v4 = (TextView) findViewById(R.id.tteen);
        v5 = (TextView) findViewById(R.id.tchild);

    }
}

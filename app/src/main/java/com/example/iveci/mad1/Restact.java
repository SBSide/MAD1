package com.example.iveci.mad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TimePicker;

public class Restact extends AppCompatActivity {
    Switch s1;
    Button b1,b2;
    DatePicker d1;
    TimePicker t1;
    Chronometer ch1;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("레스토랑 예약시스템");
        init();
        setContentView(R.layout.activity_restact);
    }

    public void resClick(View v){
        if (v.getId() == R.id.bprev) {
        }

        else if (v.getId() == R.id.bnext) {

        }
    }

    public void init(){
        s1 = (Switch) findViewById(R.id.switch1);
        b1 = (Button) findViewById(R.id.bprev);
        b2 = (Button) findViewById(R.id.bnext);
    }
}

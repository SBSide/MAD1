package com.example.iveci.mad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2;
    TextView t1,t2;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("학점 계산기");
        setContentView(R.layout.mainact);
        init();

    }

    public void onMyClick(View v){
        if (v.getId() == R.id.bcalc) {
            String p1 = e1.getText().toString().equals("") ? "0" : e1.getText().toString();
            String p2 = e2.getText().toString().equals("") ? "0" : e2.getText().toString();
            String p3 = e3.getText().toString().equals("") ? "0" : e3.getText().toString();
            int score = Integer.parseInt(p1) + Integer.parseInt(p2) + Integer.parseInt(p3);
            int avg = score / 3;
            t1.setText(score + "점");
            t2.setText(avg + "점");
            if (avg >= 90) i1.setImageResource(R.drawable.ablue);
            else if (avg >= 80) i1.setImageResource(R.drawable.bblue);
            else if (avg >= 70) i1.setImageResource(R.drawable.cred);
            else if (avg >= 60) i1.setImageResource(R.drawable.dred);
            else i1.setImageResource(R.drawable.fred);
            i1.setVisibility(View.VISIBLE);

        }

        else if (v.getId() == R.id.binit) {
            e1.setText("");
            e2.setText("");
            e3.setText("");
            t1.setText("0점");
            t2.setText("0점");
            i1.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(),"초기화 되었습니다.",Toast.LENGTH_SHORT).show();
        }
    }

    void init(){
        b1 = (Button)findViewById(R.id.bcalc);
        b2 = (Button)findViewById(R.id.binit);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (EditText)findViewById(R.id.editText3);
        t1 = (TextView)findViewById(R.id.totalscore);
        t2 = (TextView)findViewById(R.id.avgscore);
        i1 = (ImageView)findViewById(R.id.imageView);
//        r1 = (RadioButton)findViewById(R.id.radioButton);
//        r2 = (RadioButton)findViewById(R.id.radioButton2);
//        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked){
//                    Toast.makeText(getApplicationContext(),"고등학생이 선택됨.",Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
//        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked){
//                    Toast.makeText(getApplicationContext(),"대학생이 선택됨.",Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
    }
}

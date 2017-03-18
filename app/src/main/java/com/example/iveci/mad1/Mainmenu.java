package com.example.iveci.mad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("메뉴");
        setContentView(R.layout.mainmenu);
    }

    public void onYourClick(View v){
        if (v.getId() == R.id.acthakjum) {
            Intent a = new Intent(Mainmenu.this, MainActivity.class);
            startActivity(a);
        }

        else if (v.getId() == R.id.actres) {
            Intent a = new Intent(Mainmenu.this, MainActivity.class);
            startActivity(a);
        }
    }
}

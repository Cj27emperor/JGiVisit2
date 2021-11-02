package com.example.jgivisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }
    public void university(View view){
        startActivity(new Intent(AboutUs.this,AboutUniversity.class));
    }
    public void chancellor(View view){
        startActivity(new Intent(AboutUs.this,AboutChancellor.class));
    }
    public void principal(View view){
        startActivity(new Intent(AboutUs.this,AboutPrincipal.class));
    }
    public void school(View view){
        startActivity(new Intent(AboutUs.this,AboutSchool.class));
    }
}
package com.example.jgivisit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    static private Boolean login=false;
    protected RelativeLayout list,list1;
    static final public void login_func(Boolean x){
        login=x;
    };

    public static void exitApp(){
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(login==false){

            startActivity(new Intent(MainActivity.this,LandingPage.class));
        }
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        list=(RelativeLayout)findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AboutUs.class));
            }
        });
        list1=(RelativeLayout)findViewById(R.id.list2);
        list1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Schedule.class));
            }
        });
    }
}
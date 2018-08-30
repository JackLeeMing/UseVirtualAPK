package com.ttl.ljk.com.napplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.didi.virtualapk.PluginManager;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go1(View view){
        Intent intent = new Intent();
        intent.setClassName("com.ttl.ljk.com.library", "com.ttl.ljk.com.library.LoginActivity");
        startActivity(intent);
    }

    public void go2(View view){

        Intent intent = new Intent();
        intent.setClassName("com.ttl.ljk.com.lpp", "com.ttl.ljk.com.lpp.LoginActivity");
        startActivity(intent);
    }
}

package com.codebuzzers.jwdlibraryexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.codebuzzers.jwdlibrary.TestClass;
import com.codebuzzers.jwdlibrary.TestUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TestClass().TestMethod();


        Intent intent = new Intent(this, TestUI.class);
        startActivity(intent);
    }
}
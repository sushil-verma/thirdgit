package com.example.sushilverma.thirdgit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "hello ", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onDestroy() {

        Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT).show();

    }
}

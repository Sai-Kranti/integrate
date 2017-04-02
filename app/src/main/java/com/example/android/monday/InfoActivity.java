package com.example.android.monday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void click_ft(View view)
    {
        Intent i = new Intent(this, FTActivity.class);
        startActivity(i);
    }

    public void click_tailor(View view)
    {
        Intent ii = new Intent(this, TailorActivity.class);
        startActivity(ii);
    }

}

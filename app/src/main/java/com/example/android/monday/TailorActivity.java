package com.example.android.monday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TailorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tailor);
    }

    public void click_info(View view)
    {
        Intent i = new Intent(this, InfoActivity.class);
        startActivity(i);
    }

    public void click_ft(View view)
    {
        Intent ii = new Intent(this, FTActivity.class);
        startActivity(ii);
    }

}

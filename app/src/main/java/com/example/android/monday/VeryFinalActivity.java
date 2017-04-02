package com.example.android.monday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VeryFinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_very_final);
    }

    public void go_online(View view)
    {
        Intent i = new Intent(this, NotifActivity.class);
        startActivity(i);
    }

    public void go_offline(View view)
    {
        Intent ii = new Intent(this, InfoActivity.class);
        startActivity(ii);
    }
}

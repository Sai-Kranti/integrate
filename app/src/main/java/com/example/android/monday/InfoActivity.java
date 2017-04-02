package com.example.android.monday;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);



        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Startup");
        tabLayout.getTabAt(1).setText("Advantages");
        tabLayout.getTabAt(2).setText("Disadvantages");

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




    public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

        public SimpleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new StartupFragment();
            } else if (position == 1){
                return new AdvantagesFragment();
            } else {
                return new DisadvantagesFragment();
            }

        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}

package com.example.android.monday;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class NotifActivity extends BaseActivity{

    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;



    @Override int getContentViewId() {
        return R.layout.activity_notif;
    }

    @Override int getNavigationMenuItemId() {
        return R.id.navigation_notif;
    }

    @Override void initializeUI() {

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
  /**
   * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
   * one of the sections/tabs/pages.
   */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    return new GrowthAreasFragment();
                case 1:
                    return new EventsFragment();
                default:
                    return null;
            }
        }

        @Override public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.convo_growth);
                case 1:
                    return getString(R.string.convo_events);

            }
            return null;
        }
    }
}

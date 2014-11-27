package com.krswag.tabs;

import com.krswag.sling.DailyChallengeFragment;
import com.krswag.sling.SendSlingFragment;
import com.krswag.sling.SlingBoxFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabsPagerAdapter extends FragmentPagerAdapter
{

    public TabsPagerAdapter( FragmentManager fm )
    {
        super( fm );
    }


    @Override
    public Fragment getItem( int index )
    {

        switch ( index )
        {
            case 0:
                // SlingBox fragment activity
                return new SlingBoxFragment();
            case 1:
                // Send Sling fragment activity
                return new SendSlingFragment();
            case 2:
                // Daily Challenge fragment activity
                return new DailyChallengeFragment();
        }

        return null;
    }


    @Override
    public int getCount()
    {
        // get item count - equal to number of tabs
        return 3;
    }

}
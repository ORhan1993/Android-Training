package com.byengineer.tablayoutexample;

import androidx.fragment.app.FragmentManager;
import android.content.Context;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabLayoutExampleAdapter extends FragmentPagerAdapter {

    private Context mycontext;
    int totalTabs;

    public TabLayoutExampleAdapter(Context context, FragmentManager fm,int totalTabs){
        super(fm);
        mycontext=context;
        this.totalTabs=totalTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TablayoutExampleHomeFragment homeFragment=new TablayoutExampleHomeFragment();
                return  homeFragment;
            case 1:
                TablayoutExampleSportFragment sportFragment=new TablayoutExampleSportFragment();
                return  sportFragment;
            case 2:
                TablayoutExampleMovieFragment movieFragment=new TablayoutExampleMovieFragment();
                return  movieFragment;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}

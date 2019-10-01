package com.unipi.kottarido.learnpy.learnpy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SelectorStatePagerAdapter extends FragmentStatePagerAdapter {

    //periexei ta fragments
    private final List<Fragment> mFragmentList = new ArrayList<>();
    // periexei tous titlous ton fragment
    private final List<String> mFragmentTitleList = new ArrayList<>();

    //default constructor
    public SelectorStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //prosthetei ta fragments stin fragmentList
    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    //epistrefei to fragment pou psaxnoume
    //auto pou vriskete stin sigkekrimeni thesi sto fragment List
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    public String getTitle(int position){ return mFragmentTitleList.get(position);}
    public int getCount() {
        return mFragmentList.size();
    }
}

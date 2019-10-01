package com.unipi.kottarido.learnpy.learnpy;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SelectorPagerAdapter extends FragmentPagerAdapter {

    //periexei ta fragments
    private final List<Fragment> mFragmentList = new ArrayList<>();
    // periexei tous titlous ton fragment
    private final List<String> mFragmentTitleList = new ArrayList<>();

    //default constructor
    public SelectorPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //prosthetei ta fragments stin fragmentList
    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    //method who adds course fragment( pos = 3)
    public void addCourseFragment(Fragment fragment,String title){
        mFragmentList.set(3,fragment);
        mFragmentTitleList.set(3,title);
    }

    //epistrefei ton titlo tou fragment
    public List<String> getmFragmentTitleList() {
        return mFragmentTitleList;
    }

    //epistrefei to fragment pou psaxnoume
    //auto pou vriskete stin sigkekrimeni thesi sto fragment List
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    //EPISTREFEI TO PLITHOS TON FRAGMENTS
    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}

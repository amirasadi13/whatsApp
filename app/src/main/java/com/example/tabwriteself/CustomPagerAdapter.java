package com.example.tabwriteself;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tabwriteself.fragments.FirstFrag;
import com.example.tabwriteself.fragments.SecondFrag;
import com.example.tabwriteself.fragments.ThirdFrag;

public class CustomPagerAdapter extends FragmentStatePagerAdapter {


    final int PAGE_COUNT =2;
    private String title[] = new String[] {"CHATS","STATUS","CALLS"};
    private Context context;

    public CustomPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FirstFrag tab1 =new FirstFrag();
                return tab1;
            case 1:
                SecondFrag tab2 =new SecondFrag();
                return tab2;
            case 2:
                ThirdFrag tab3 =new ThirdFrag();
                return tab3;
                default:
        }
        return null;
    }

    @Override
    public int getCount() {
        return title.length;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}

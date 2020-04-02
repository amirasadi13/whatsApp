package com.example.tabwriteself.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabwriteself.CustomPagerAdapter;
import com.example.tabwriteself.R;
import com.example.tabwriteself.databinding.FragmentHomeBinding;


public class HomeFrag extends Fragment {



    FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);

        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(getChildFragmentManager(), getContext());
        binding.viewPager.setAdapter(customPagerAdapter);
        binding.tabs.setupWithViewPager(binding.viewPager);
        return binding.getRoot();
    }



}

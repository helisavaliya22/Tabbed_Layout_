package com.example.tabbed_layout_demo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.tabbed_layout_demo.ui.main.SectionsPagerAdapter;
import com.example.tabbed_layout_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        Pager_Adapter adapter=new Pager_Adapter(getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;

        adapter.addFragment(new Fragment_One(),"Tab-1");
        adapter.addFragment(new Fragment_Two(),"Tab-2");
        adapter.addFragment(new Fragment_Three(),"Tab-3");

        viewPager.setAdapter(adapter);
        TabLayout tabs = binding.tabs;

        tabs.setupWithViewPager(viewPager);

    }
}
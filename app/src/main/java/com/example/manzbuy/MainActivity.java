package com.example.manzbuy;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_category:
                    return true;
                case R.id.navigation_market:
                    return true;
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_bookmark:
                    return true;
                case R.id.navigation_mypage:
                    return true;
            }
            return false;
        }
    };

    private TabLayout homeTapLayout;
    private ViewPager viewPager;
    private HomePagerAdapter homePagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavView = findViewById(R.id.bottom_nav_view);
        bottomNavView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        homeTapLayout = (TabLayout) findViewById(R.id.home_layout_tab);
        homeTapLayout.addTab(homeTapLayout.newTab().setText("Home"));
        homeTapLayout.addTab(homeTapLayout.newTab().setText("New"));
        homeTapLayout.addTab(homeTapLayout.newTab().setText("Best"));
        homeTapLayout.addTab(homeTapLayout.newTab().setText("Event"));

        viewPager = (ViewPager)findViewById(R.id.home_pager_content);
        homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager(), homeTapLayout.getTabCount());
        viewPager.setAdapter(homePagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(homeTapLayout));
        homeTapLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab){

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab){

            }
        });
    }

}

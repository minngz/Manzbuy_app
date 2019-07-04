package com.example.manzbuy;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
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

        viewPager = (ViewPager)findViewById(R.id.home_viewpager);
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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //App Bar의 좌측 영영에 Drawer를 Open 하기 위한 Icon 추가
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);
        }
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.category_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.drawer_open,
                R.string.drawer_close
        );

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.item_sale: break;
                    case R.id.item_outer: break;
                    case R.id.item_top: break;
                    case R.id.item_bottom: break;
                    case R.id.item_shoes: break;
                    case R.id.item_bag: break;
                    case R.id.item_accessory: break;
                    case R.id.item_headwear: break;
                    case R.id.item_underwear: break;
                    case R.id.item_beachwear: break;
                }

                DrawerLayout drawer = findViewById(R.id.category_layout);
                drawer.closeDrawer(GravityCompat.START);
                return false; //true?
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.category_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}

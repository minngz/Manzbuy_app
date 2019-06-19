package com.example.manzbuy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class BookmarkActivity extends AppCompatActivity {
    private BottomNavigationView.OnNavigationItemSelectedListener bOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem bookmarkItem) {
            switch (bookmarkItem.getItemId()) {
                case R.id.bookmark_item_menu:
                    return true;
                case R.id.bookmark_market_menu:
                    return true;
            }
            return false;
        }
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookmark_frame_fragment);
        BottomNavigationView bottomNavView = findViewById(R.id.bookmark_nav_view);
        bottomNavView.setOnNavigationItemSelectedListener(bOnNavigationItemSelectedListener);
    }
}

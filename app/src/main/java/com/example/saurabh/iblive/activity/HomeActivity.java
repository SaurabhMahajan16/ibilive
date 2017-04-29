package com.example.saurabh.iblive.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.saurabh.iblive.R;

/**
 * home activity contains side menu and container for fragment
 */
public class HomeActivity extends AppCompatActivity {
    private ImageButton imgbtnDrawer;
    private DrawerLayout mDrawer;
    private TextView tvTitle, tvHome, tvCards, tvlogout, tvNetworks, tvSupport, tvShare;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        imgbtnDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                mDrawer.openDrawer(Gravity.START);
            }
        });
    }

    private void init() {
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        imgbtnDrawer = (ImageButton) findViewById(R.id.ib_drawer);
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvHome = (TextView) findViewById(R.id.tv_home);
        tvCards = (TextView) findViewById(R.id.tv_cards);
        tvlogout = (TextView) findViewById(R.id.tv_logout);
        tvNetworks =(TextView) findViewById(R.id.tv_network);
        tvShare = (TextView) findViewById(R.id.tv_share);
        tvSupport =(TextView) findViewById(R.id.tv_support);

    }
}

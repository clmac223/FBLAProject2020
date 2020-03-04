/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.tabexperiment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * This app offers three view fragments and three tabs below the app bar to
 * navigate to them, as well as the options menu showing Settings.
 */
public class MainActivity extends AppCompatActivity {
Button hell;
    Button hell2;
    Button hell3;
    Button hell4;
     /**3
     * Creates the content view and toolbar, sets up the tab layout, and sets up
     * a page adapter to manage views in fragments. The user clicks a tab and
     * navigates to the view fragment.
     *
     * @param savedInstanceState Saved instance state bundle.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hell = findViewById(R.id.open_website_button);
        hell2 = findViewById(R.id.button);
        hell3 = findViewById(R.id.button1);
        hell4 = findViewById(R.id.button2);
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("FBLA Mobile Devolpment");

        // Create an instance of the tab layout from the view.
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        // Set the text for each tab.cal
        tabLayout.addTab(tabLayout.newTab().setText("About & Links"));
        tabLayout.addTab(tabLayout.newTab().setText("Signup For Events"));
        tabLayout.addTab(tabLayout.newTab().setText("Officers"));

        // Set the tabs to fill the entire layout.
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Use PagerAdapter to manage page views in fragments.
        // Each page is represented by its own fragment.
        final ViewPager viewPager = findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        // Setting a listener for clicks.
        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(
                new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition() > 0)
                    hell.setVisibility(View.GONE);
                else
                    hell.setVisibility(View.VISIBLE);

                if(tab.getPosition() > 0)
                    hell2.setVisibility(View.GONE);
                else
                    hell2.setVisibility(View.VISIBLE);

                if(tab.getPosition() > 0)
                    hell3.setVisibility(View.GONE);
                else
                    hell3.setVisibility(View.VISIBLE);

                if(tab.getPosition() > 0)
                    hell4.setVisibility(View.GONE);
                else
                    hell4.setVisibility(View.VISIBLE);
                /*if(tab.getPosition() == 0)
                    hell.setVisibility(View.GONE);*/

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
    public void openWebsite(View view) {
        // Get the URL text.
        String url = "https://www.fbla-pbl.org/competitive-event/mobile-application-development-fbla/";

        // Parse the URI and create the intent.
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }

    public void openWebsite2(View view) {
        // Get the URL text.
        String url = "https://twitter.com/MediaFbla/";

        // Parse the URI and create the intent.
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }

    public void openWebsite3(View view) {
        // Get the URL text.
        String url = "https://www.fbla-pbl.org/contact/";

        // Parse the URI and create the intent.
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }

    public void openWebsite4(View view) {
        // Get the URL text.
        String url = "https://www.fbla-pbl.org/fbla/competitive-events/";

        // Parse the URI and create the intent.
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }
}

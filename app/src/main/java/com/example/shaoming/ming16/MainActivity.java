package com.example.shaoming.ming16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {
    //BottomNavigation實作練習
    //在Gradle Scripot > build gradle 加入compile 'com.aurelhubert:ahbottomnavigation:1.2.3'
    //參考網址:https://github.com/aurelhubert/ahbottomnavigation
    AHBottomNavigation ahBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ahBottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

        //Create items

        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.tab_1, R.drawable.ball, R.color.color_tab_1);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("Item 2", R.drawable.ball);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("Item 3", R.drawable.ball);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem("Item 4", R.drawable.ball);

        // Add items
        // 加入

        ahBottomNavigation.addItem(item1);
        ahBottomNavigation.addItem(item2);
        ahBottomNavigation.addItem(item3);
        ahBottomNavigation.addItem(item4);


        // Set current item programmatically
        //設定它目前在第幾個

        ahBottomNavigation.setCurrentItem(1);
    }
}

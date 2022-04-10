package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;


public class HomePage extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void gotoProfileFrag(View v) // 当Profile按钮被按下时, 此方法启动
    {
        ProfileFragment prof = new ProfileFragment();
        this.redirectTo(prof);
    }
    public void gotoWelcomeFrag(View v) // 当HOME按钮被按下时, 此方法启动
    {
        WelcomeFragment welcome = new WelcomeFragment();
        this.redirectTo(welcome);

    }

    public void redirectTo(Fragment frag) // 用来切换Fragment的方法
    {
        FragmentManager fgManager = this.getSupportFragmentManager(); // 创建 FragmentManager 对象
        FragmentTransaction fgTrans = fgManager.beginTransaction();  // 创建 Transaction 对象

        fgTrans.replace(R.id.fragmentContainerView, frag);  // 将目前的Container切换为 frag
        fgTrans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fgTrans.commit();
    }
}



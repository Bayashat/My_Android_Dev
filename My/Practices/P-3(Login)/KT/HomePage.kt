package com.example.log_in1_0

import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


class HomePage : AppCompatActivity() 
{
    override fun onCreate(savedInstanceState: Bundle?) 
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
    }

    fun gotoProfileFrag(v: View?)  // 当Profile按钮被按下时, 此方法启动
    { 
        val prof = ProfileFragment()
        redirectTo(prof)
    }

    fun gotoWelcomeFrag(v: View?)  // 当HOME按钮被按下时, 此方法启动
    {
        val welcome = WelcomeFragment()
        redirectTo(welcome)
    }

    fun redirectTo(frag: Fragment?) // 用来切换Fragment的方法
    {
        val fgManager = this.supportFragmentManager  // 创建 FragmentManager 对象
        val fgTrans = fgManager.beginTransaction()  // 创建 Transaction 对象

        // val fgTrans = supportFragmentManager.beginTransaction()

        fgTrans.replace(R.id.fragmentContainerView, frag!!)  // 将目前的Container切换为 frag
        fgTrans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fgTrans.commit()
    }
}

package com.mgm.spacebottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_favorites -> {}
            R.id.action_schedules -> {}
            R.id.action_music -> {}
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mView = findViewById<CurvedBottomNavigationView>(R.id.customBottomBar)
        mView.inflateMenu(R.menu.bottom_menu)
        mView.selectedItemId = R.id.action_schedules
        //getting bottom navigation view and attaching the listener
        mView.setOnNavigationItemSelectedListener(this@MainActivity)
    }
}

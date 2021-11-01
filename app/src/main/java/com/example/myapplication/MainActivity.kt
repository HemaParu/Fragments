package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val fragmentButton1 = findViewById<Button>(R.id.fragment1)
    val fragmentButton2 = findViewById<Button>(R.id.fragment2)
    val fragmentFirst = FirstFragment()
    val fragmentSecond = Fragment5()
    fragmentButton1.setOnClickListener {
      replaceFragment(fragmentFirst)
    }
    fragmentButton2.setOnClickListener {
      replaceFragment(fragmentSecond)
    }
    replaceFragment(fragmentFirst)
  }
  
  private fun replaceFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction().apply {
      replace(R.id.frameLayout, fragment)
      commit()
    }
  }
}
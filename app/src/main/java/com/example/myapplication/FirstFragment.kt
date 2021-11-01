package com.example.myapplication

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_first) {
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val view = inflater.inflate(R.layout.fragment_first, container, false)
    val tv = view.findViewById<TextView>(R.id.textviewForFirstFragment)
    tv.movementMethod = ScrollingMovementMethod()
    return view
  }
}
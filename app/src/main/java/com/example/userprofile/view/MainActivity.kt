package com.example.userprofile.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userprofile.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setOnClickListener {

        }
    }

    fun callApi(){

    }

}
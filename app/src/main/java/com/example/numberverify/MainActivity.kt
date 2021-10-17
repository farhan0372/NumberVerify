package com.example.numberverify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ferame1:FrameLayout=findViewById(R.id.ac_main3_frm_one)
        val ferame2:FrameLayout=findViewById(R.id.ac_main3_frm_two)
        val btn1:Button=findViewById(R.id.ac_main3_btn_1)
        val btn2:Button=findViewById(R.id.ac_main3_btn_2)

        btn1.setOnClickListener {
            ferame1.visibility=View.GONE
            ferame2.visibility=View.VISIBLE
        }
        btn2.setOnClickListener {
            ferame2.visibility=View.GONE
            ferame1.visibility=View.VISIBLE
        }

    }
}
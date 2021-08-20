package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }
    private fun setListener(){

        val clickableViews: List<View> =
            listOf(findViewById(R.id.box_one_text),findViewById(R.id.box_two_text), findViewById(R.id.box_three_text),
                findViewById(R.id.box_four_text), findViewById(R.id.box_five_text), findViewById(R.id.constrain_layout),
                findViewById(R.id.re_button), findViewById(R.id.yellow_botton),findViewById(R.id.green_button))
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.re_button-> findViewById<View>(R.id.box_three_text).setBackgroundResource(R.color.my_red);
            R.id.yellow_botton-> findViewById<View>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow);
            R.id.green_button-> findViewById<View>(R.id.box_five_text).setBackgroundResource(R.color.my_green);
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
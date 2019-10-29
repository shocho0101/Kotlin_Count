package com.example.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count_text_view.text = "0"

        plus_button.setOnClickListener {
            number += 1
            count_text_view.text = number.toString()
        }
        
        minus_button.setOnClickListener {
            number -= 1
            count_text_view.text = number.toString()
        }
    }
}

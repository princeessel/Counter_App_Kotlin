package com.example.kotlinappstutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_counter.text = "Counter"
        btn_reset.text = "Decrease"

        btn_counter.setOnClickListener {
            count()
        }

        btn_reset.setOnClickListener {
            decrease()
        }
    }

    private fun count() {
        counter++
        count_tv.text = "$counter"
    }

    private fun decrease() {
        counter--
        count_tv.text = "$counter"
    }
}
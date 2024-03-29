package com.example.recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //recyclerView_main.setBackgroundColor(Color.BLUE)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = MainAdapter()

        fetchJson()
    }

    fun fetchJson() {
        println("Attempting to Fetch JSON")
    }
}

package com.example.turkcell_listview_odev

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)




        Toast.makeText(this,intent.getStringExtra("data"),Toast.LENGTH_SHORT).show()

    }
}
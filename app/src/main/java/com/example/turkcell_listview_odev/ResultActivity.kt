package com.example.turkcell_listview_odev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ResultActivity : AppCompatActivity() {

    lateinit var dataListView: ListView
    lateinit var dataListView2: ListView

    var arr1 = arrayListOf<String>()
    var arr2 = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        intent.getStringArrayListExtra("data1")?.let {
            arr1 = it
        }
        intent.getStringArrayListExtra("data2")?.let {
            arr2 = it
        }

        dataListView = findViewById(R.id.dataListView)
        var adapter1 =
            ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, arr1)
        dataListView.adapter = adapter1
        dataListView2 = findViewById(R.id.dataListView2)
        var adapter2 =
            ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, arr2)
        dataListView2.adapter = adapter2
        adapter1.notifyDataSetChanged()
        adapter2.notifyDataSetChanged()

        dataListView.setOnItemClickListener { adapterView, view, i, l ->

            var intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("data", arr1.get(i))
            startActivity(intent)
            true
        }

        dataListView2.setOnItemClickListener { adapterView, view, i, l ->

            var intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("data", arr2.get(i))
            startActivity(intent)
            true
        }

    }


}
package com.example.turkcell_listview_odev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var ediTextData: EditText
    lateinit var ediTextData2: EditText
    lateinit var addDataButton: Button
    lateinit var addDataButton2: Button
    lateinit var resultButton: Button

    var arrayList1 = arrayListOf<String>()
    var arrayList2 = arrayListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ediTextData = findViewById(R.id.editTextName)
        ediTextData2 = findViewById(R.id.editTextNumeric)
        addDataButton = findViewById(R.id.addDataButton)
        addDataButton2 = findViewById(R.id.addDataButton2)
        resultButton = findViewById(R.id.resultButton)

        addDataButton.setOnClickListener {
            val data1 = ediTextData.text.toString()
            data1.isNotEmpty().let {
                arrayList1.add(data1)
            }
            ediTextData.setText("")
            ediTextData.requestFocus()
        }

        addDataButton2.setOnClickListener {
            val data2 = ediTextData2.text.toString()
            data2.isNotEmpty().let {
                arrayList2.add(data2)
            }
            ediTextData2.setText("")
        }

        resultButton.setOnClickListener {
            intent = Intent(this, ResultActivity::class.java)
            intent.putStringArrayListExtra("data1", arrayList1)
            intent.putStringArrayListExtra("data2", arrayList2)
            startActivity(intent)
        }

    }

}
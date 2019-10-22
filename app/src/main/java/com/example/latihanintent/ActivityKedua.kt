package com.example.latihanintent

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityKedua : AppCompatActivity(){
    private lateinit var tvData1 : TextView
    private lateinit var tvData2 : TextView
    private lateinit var tvData3 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        tvData1 = findViewById(R.id.tv_data1)
        tvData2 = findViewById(R.id.tv_data2)
        tvData3 = findViewById(R.id.tv_data3)

        tvData1.setText(intent.getStringExtra("nim"))
        tvData2.setText(intent.getStringExtra("nama"))
        tvData3.setText(intent.getStringExtra("nilai"))
    }
}
package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var etData1 : EditText
    private lateinit var etData2 : EditText
    private lateinit var etData3 : EditText
    private lateinit var btSubmit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etData1 = findViewById(R.id.et_data1)
        etData2 = findViewById(R.id.et_data2)
        etData3 = findViewById(R.id.et_data3)
        btSubmit = findViewById(R.id.bt_submit)

        bt_submit.setOnClickListener{
            val intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("nim", etData1.text.toString())
            intent.putExtra("nama", etData2.text.toString())
            intent.putExtra("nilai", etData3.text.toString())
            startActivity(intent)
        }
    }
}

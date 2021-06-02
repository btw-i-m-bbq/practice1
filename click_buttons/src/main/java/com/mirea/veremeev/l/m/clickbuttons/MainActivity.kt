package com.mirea.veremeev.l.m.clickbuttons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textOut: TextView
    private lateinit var OkButton: Button
    private lateinit var CancelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textOut = findViewById(R.id.textView)
        OkButton = findViewById(R.id.OkButton)

        OkButton.setOnClickListener {
            textOut.setText("Нажата кнопка ОК")
        }


    }
    fun onCancelButton(view : View){
        Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show()
    }
}
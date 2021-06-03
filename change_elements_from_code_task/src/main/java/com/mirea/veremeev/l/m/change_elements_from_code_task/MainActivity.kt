package com.mirea.veremeev.l.m.change_elements_from_code_task

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myTextView = findViewById<TextView>(R.id.SampleTextView)
        myTextView.setText("New text in MIREA")

        val button = findViewById<Button>(R.id.TestButton)
        button.setText("MireaButton")

        val checkBox = findViewById<CheckBox>(R.id.SampleCheckBox)
        checkBox.setChecked(true)
    }
}
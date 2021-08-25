package com.itiudec.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val descriptionInput = findViewById<EditText>(R.id.description)
        val phoneNumberText = findViewById<TextView>(R.id.phoneNumber)
        val goButton = findViewById<Button>(R.id.go_button)
        goButton.setOnClickListener(){
            if (descriptionInput.text.isEmpty()){
                Toast.makeText(this, "Please type something...", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            phoneNumberText.text = descriptionInput.text
        }
    }
}
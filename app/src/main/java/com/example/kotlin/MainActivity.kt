package com.example.kotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import com.example.kotlin.Constants.Companion.BLUE_COLOR_DEFINITION
import com.example.kotlin.Constants.Companion.GREEN_COLOR_DEFINITION
import com.example.kotlin.Constants.Companion.RED_COLOR_DEFINITION

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val label: TextView = findViewById(R.id.main_label)
        //val userData: EditText = findViewById(R.id.user_data)
        val button: Button = findViewById(R.id.main_button)

        button.setOnClickListener {
//            val text = userData.text.toString().trim()
//            if (text == "toast") {
//                Toast.makeText(this, "User has entered toast", Toast.LENGTH_SHORT).show()
//            } else {
//                label.text = text
//            }
//            val intent = Intent(this, ColorActivity::class.java)
//            intent.putExtra("color", text)
//            startActivity(intent)
            val redBar = findViewById<SeekBar>(R.id.red_bar)
            val greenBar = findViewById<SeekBar>(R.id.green_bar)
            val blueBar = findViewById<SeekBar>(R.id.blue_bar)

            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra(RED_COLOR_DEFINITION, redBar.progress)
            intent.putExtra(BLUE_COLOR_DEFINITION, blueBar.progress)
            intent.putExtra(GREEN_COLOR_DEFINITION, greenBar.progress)
            startActivity(intent)
        }
    }
}
package com.example.kotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kotlin.Constants.Companion.BLUE_COLOR_DEFINITION
import com.example.kotlin.Constants.Companion.GREEN_COLOR_DEFINITION
import com.example.kotlin.Constants.Companion.RED_COLOR_DEFINITION

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        val colorButton = findViewById<Button>(R.id.color_button)
        colorButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val intent = intent
        val redColor = intent.getIntExtra(RED_COLOR_DEFINITION, 0)
        val blueColor = intent.getIntExtra(BLUE_COLOR_DEFINITION, 0)
        val greenColor = intent.getIntExtra(GREEN_COLOR_DEFINITION, 0)
        val layout = findViewById<ConstraintLayout>(R.id.color_layout)
        layout.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor))
        colorButton.setBackgroundColor(Color.rgb(255 - redColor, 255 - greenColor, 255 - blueColor))
        colorButton.setTextColor(Color.rgb(redColor, greenColor, blueColor))
    }
}
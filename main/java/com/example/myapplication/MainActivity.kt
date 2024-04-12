package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val imageView = findViewById<ImageView>(R.id.imageview)
        val textView = findViewById<TextView>(R.id.textview)
        val redColor = ContextCompat.getColor(this,R.color.red)
        val defaultColor = ContextCompat.getColor(this,R.color.gray)

        fun resetButtons() {
            button1.setBackgroundColor(defaultColor)
            button2.setBackgroundColor(defaultColor)
            button3.setBackgroundColor(defaultColor)
            button4.setBackgroundColor(defaultColor)
        }

        button1.setOnClickListener {
            resetButtons()
            button1.setBackgroundColor(redColor)
            imageView.setImageResource(R.drawable.g1)
            textView.text = "标题1"
        }
        button2.setOnClickListener {
            resetButtons()
            button2.setBackgroundColor(redColor)
            imageView.setImageResource(R.drawable.g2)
            textView.text = "标题2"
        }
        button3.setOnClickListener {
            resetButtons()
            button3.setBackgroundColor(redColor)
            imageView.setImageResource(R.drawable.g3)
            textView.text = "标题3"
        }
        button4.setOnClickListener {
            resetButtons()
            button4.setBackgroundColor(redColor)
            imageView.setImageResource(R.drawable.g4)
            textView.text = "标题4"
        }
    }

}

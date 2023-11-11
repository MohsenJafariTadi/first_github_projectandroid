package com.example.firstgirproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"hello to all after first commit",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"toast number1",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"toast number2",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"toast number3",Toast.LENGTH_LONG).show()
    }
}
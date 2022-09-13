package com.example.wordle_burwell_tibbs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

    if (guessMax != 0) {
        var isRight = false
        val editText
        var changeText = editText.text.toString().uppercase(Locale.getDefault());
        if(changeText.length==4){
            wrongView.text=""
            val outcome = confirmGuess(changeText, makeGuess)
            confirmGuess(changeText, makeGuess)
        }
    }
    }
}
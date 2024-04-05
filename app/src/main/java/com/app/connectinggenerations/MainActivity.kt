package com.app.connectinggenerations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnGenerate.setOnClickListener {
            var message: String = ""

            if (etAge.toString().equals("25")) {
                message = "For ${etAge.toString()} years your history icon match is: John Keats English he was a romantic poet"
            } else if (etAge.toString().equals("27")) {
                message = "For ${etAge.toString()} years your history icon match is : Jimi Hendrix he was American singer and songwriter "
            } else if (etAge.toString().equals("32")) {
                message = "For ${etAge.toString()} years your history icon match is : Alexander the Gread he was Military leader "
            } else if (etAge.toString().equals("37")) {
                message = "For ${etAge.toString()} years your history icon match is : Vincent Van Gogh he was Dutch Painter "
            } else if (etAge.toString().equals("40")) {
                message = "For ${etAge.toString()} years your history icon match is: Edgar Allan Poe he was American writer and poet "
            } else if (etAge.toString().equals("47")) {
                message = "For ${etAge.toString()} years your history icon match is: Frida Kahlo he was Mexican artist "
            } else if (etAge.toString().equals("52")) {
                message = "For ${etAge.toString()} years your history icon match is : William Shakespear he was English playwriter and poet "
            } else if (etAge.toString().equals("61")) {
                message = "For ${etAge.toString()} years your history icon match is : Theodore Roosevelt he was the 26th President of United States "
            } else if (etAge.toString().equals("72")) {
                message = "For ${etAge.toString()} years your history icon match is: John Wayne he was an Actor "
            } else if (etAge.toString().equals("96")) {
                message = "For ${etAge.toString()} years your history icon match is: Queen Elizabeth she was Queen of United Kingdom"
            } else if (etAge.toString().equals("<20 OR >100")) {
                message = "For ${etAge.toString()} years you entered a age out of range "
            } else { message = "For ${etAge.toString()} years, you have entered an invalid age"

            }
            btnClear.setOnClickListener {
                etAge.clear()
            }
            tvResult.text = "Hi ${message}"
        }
    }
}





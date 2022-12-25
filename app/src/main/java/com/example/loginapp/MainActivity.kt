package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            btn1.setOnClickListener {

                val username  = ed1.text.toString().trim()
                val password =  ed2.text.toString().trim()

                if (username.isEmpty()){
                    ed1.error="enter username"
                    ed1.requestFocus()
                }
                else if (password.isEmpty()){

                    ed2.error="enter password"
                    ed2.requestFocus()
                }

                else{

                    val intent=Intent(this,NewActivity2::class.java)
                    startActivity(intent)
                    finish()

                }

            }


    }
}
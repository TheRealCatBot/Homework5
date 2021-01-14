package com.example.homework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }


    fun init()
    {
        var switch = false
        val loginbutton = findViewById<Button>(R.id.LoginButton)
        val email = findViewById<EditText>(R.id.Email)
        val password = findViewById<EditText>(R.id.Password)
        val terms = findViewById<CheckBox>(R.id.checkBox)

        val passwordtext = password.text
        val emailtext = email.text

        loginbutton.setOnClickListener {

            if(!terms.isChecked)
            {
                Toast.makeText(this, "Please Read the Terms and Agreements", Toast.LENGTH_SHORT).show()
                switch = false
            }
            else
            {
                switch = true
            }


            if(email.text.isEmpty() && password.text.isEmpty())
            {
                Toast.makeText(this, "Please Fill in The Parameters", Toast.LENGTH_SHORT).show()
                switch = false
            }
            else if(email.text.isEmpty())
            {
                Toast.makeText(this, "Please Fill in The email Bar", Toast.LENGTH_SHORT).show()
                switch = false
            }
            else if(password.text.isEmpty())
            {
                Toast.makeText(this,"Please Fill in the Password Bar", Toast.LENGTH_SHORT).show()
                switch = false
            }


            if(switch)
            {
                if(emailtext.contains("@"))
                {
                    setContentView(R.layout.activity_profile)
                }
            }
        }
    }
}
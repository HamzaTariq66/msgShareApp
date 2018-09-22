package com.testapplication.user.msgshareapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.testapplication.user.msgshareapp.R.id.Submit
import com.testapplication.user.msgshareapp.R.id.UserText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Submit.setOnClickListener {

            val message : String = UserText.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("user_message" , message)
            startActivity(intent)

        }
    }



}

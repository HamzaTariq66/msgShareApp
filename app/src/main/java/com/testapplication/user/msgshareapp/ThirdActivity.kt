package com.testapplication.user.msgshareapp

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        BackBtn1.setOnClickListener {

            setResult(Activity.RESULT_OK)
            finish()

        }

        Backbtn2.setOnClickListener {

            setResult(Activity.RESULT_OK)
            finish()

        }

    }

}

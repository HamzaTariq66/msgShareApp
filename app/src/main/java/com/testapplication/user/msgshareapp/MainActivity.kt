package com.testapplication.user.msgshareapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.testapplication.user.msgshareapp.R.id.Submit
import com.testapplication.user.msgshareapp.R.id.UserText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Submit.setOnClickListener {

            val message : String = UserText.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("user_message" , message)
            startActivityForResult(intent , REQUEST_CODE)


        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE){
            if (resultCode == Activity.RESULT_OK){
                var result = data!!.extras.get("return").toString()

                Toast.makeText(this,result,Toast.LENGTH_SHORT).show()
            }

        }

    }
}

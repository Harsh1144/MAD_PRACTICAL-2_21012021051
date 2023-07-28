package com.example.mad_practical_2_21012021051

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    showMessage("on create method is called")

    }
   fun showMessage(message:String){
       Log.i(TAG, message)
       Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
   }

    override fun onStart() {
        super.onStart()
        showMessage("on start method is called")
    }
}
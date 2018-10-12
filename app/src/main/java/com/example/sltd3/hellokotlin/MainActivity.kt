package com.example.sltd3.hellokotlin


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG ="Mainactivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strings = arrayOf("one","5")

        println(strings[1])

        doSomething()

        Log.d(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResum")
    }

    fun doSomething(){
        println("Hello")
    }

}


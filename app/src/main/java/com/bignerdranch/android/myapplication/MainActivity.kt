package com.bignerdranch.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        overridePendingTransition(R.anim.slide_in, R.anim.fade_out);
        /*val animRotate: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val btn_rotate = findViewById<Button>(R.id.btn_rotate)*/
    var tv=findViewById<TextView>(R.id.textView)
        val animAlpha: Animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
        val btn_hide = findViewById<Button>(R.id.btn_hide)

        val animBig: Animation = AnimationUtils.loadAnimation(this, R.anim.scale)
        val btn_big = findViewById<Button>(R.id.btn_big)

        /*val animMove: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_translate)
        val btn_ride = findViewById<Button>(R.id.btn_ride)*/

        val animSmall: Animation = AnimationUtils.loadAnimation(this, R.anim.scale_small)
        val btn_small = findViewById<Button>(R.id.btn_small)
        btn_hide.setOnClickListener(View.OnClickListener {
            tv.startAnimation(animAlpha)
        })



        btn_big.setOnClickListener(View.OnClickListener {
            tv.startAnimation(animBig)
        })


        btn_small.setOnClickListener(View.OnClickListener {
            tv.startAnimation(animSmall)
        })
    }
}
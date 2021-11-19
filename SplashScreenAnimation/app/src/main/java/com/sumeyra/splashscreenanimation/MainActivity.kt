package com.sumeyra.splashscreenanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.sumeyra.splashscreenanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var yukaridanAsagi = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        var asagidanyulari = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        binding.imageView.animation = yukaridanAsagi
        binding.imageView2.animation=asagidanyulari

    }
}
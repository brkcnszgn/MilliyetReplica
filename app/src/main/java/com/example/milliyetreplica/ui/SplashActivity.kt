package com.example.milliyetreplica.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.milliyetreplica.R
import com.example.milliyetreplica.util.extStartActivity


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                this@SplashActivity extStartActivity DashboardActiviy::class.java
            }

            override fun onTick(millisUntilFinished: Long) {}
        }.start()
//        var fillableLoaders = findViewById<FillableLoader>(R.id.fillableLoader)
// val splash = findViewById<FrameLayout>(R.id.splash)
//
//        val params: FrameLayout.LayoutParams = FrameLayout.LayoutParams(16, 16)
//        params.gravity = Gravity.CENTER
//        val loaderBuilder = FillableLoaderBuilder()
//        fillableLoaders = loaderBuilder.parentView(splash)
//            .svgPath(Paths.JOB_AND_TALENT)
//            .layoutParams(params)
//            .originalDimensions(970, 970)
//            .strokeColor(Color.parseColor("#1c9ade"))
//            .fillColor(Color.parseColor("#1c9ade"))
//            .strokeDrawingDuration(2000)
//            .clippingTransform(WavesClippingTransform())
//            .fillDuration(10000)
//            .build()
//
//        fillableLoaders.postDelayed({ fillableLoaders.start() }, 250)
    }
}

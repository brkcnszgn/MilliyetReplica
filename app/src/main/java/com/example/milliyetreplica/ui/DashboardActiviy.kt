package com.example.milliyetreplica.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.milliyetreplica.R
import com.example.milliyetreplica.adapter.CategoryAdapter
import com.example.milliyetreplica.mock.MockData
import com.example.milliyetreplica.util.extGetDrawable
import kotlinx.android.synthetic.main.activity_dashboard_activiy.*

class DashboardActiviy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_activiy)
        init()
    }

    private fun init() {
        vpNewsCategory.adapter =
            CategoryAdapter(
                supportFragmentManager,
                MockData.getNewsCategoryFragment()
            )

        tabLayNewsCategory.setupWithViewPager(vpNewsCategory)

        toolbar.logo = extGetDrawable(R.drawable.milliyet_logo_white)
    }
}

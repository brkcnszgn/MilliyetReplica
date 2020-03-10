package com.example.milliyetreplica.ui

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import com.example.milliyetreplica.R
import com.example.milliyetreplica.adapter.NewsListAdapter
import com.example.milliyetreplica.mock.MockData
import com.example.milliyetreplica.util.exToast
import kotlinx.android.synthetic.main.activity_slider.*
import kotlinx.android.synthetic.main.fragment_new.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class NewFragment : Fragment(R.layout.fragment_new) {
//  Yeni gelen özellik ile fragmentin const. olarak yazılabilir
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_blank, container, false)
//    }
var currentPage: Int = 0
    var timer: Timer? = null
    val DELAY_MS: Long = 500 //delay in milliseconds before task is to be executed

    val PERIOD_MS: Long = 3000 // time in milliseconds between successive task executions.


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycNewsList.adapter = NewsListAdapter(
            MockData.getNewsList(1),
            MockData.getNewSliderList(5)
        ) { baseNewsModel ->

        }

        reflesh.setOnRefreshListener {
            "Selamün alekyüm".exToast(requireContext())
            reflesh.isRefreshing = false
        }
        val handler = Handler()
        val Update = Runnable {
            if (currentPage === MockData.getNewSliderList(2).size) {
                currentPage = 0
            }
            sliderrr.setCurrentItem(currentPage++, true)
        }

        timer = Timer() // This will create a new Thread

        timer!!.schedule(object : TimerTask() {
            // task to be scheduled
            override fun run() {
                handler.post(Update)
            }
        }, DELAY_MS, PERIOD_MS)
    }
}

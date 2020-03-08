package com.example.milliyetreplica.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.milliyetreplica.R
import com.example.milliyetreplica.adapter.NewsListAdapter
import com.example.milliyetreplica.mock.MockData
import com.example.milliyetreplica.util.exToast
import kotlinx.android.synthetic.main.fragment_new.*

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycNewsList.adapter = NewsListAdapter(MockData.getNewsList(10)) { baseNewsModel ->

        }

        reflesh.setOnRefreshListener {
            "Selamün alekyüm".exToast(requireContext())
            reflesh.isRefreshing = false
        }
    }
}

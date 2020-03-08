package com.example.milliyetreplica.mock

import com.example.milliyetreplica.enums.NewsType
import com.example.milliyetreplica.model.AdsModel
import com.example.milliyetreplica.model.BaseNewsModel
import com.example.milliyetreplica.model.FragmentModel
import com.example.milliyetreplica.model.NewsModel
import com.example.milliyetreplica.ui.NewFragment
import com.google.android.gms.ads.AdSize


object MockData {
    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(getTitleList().size) { position ->
            val newsFragment = NewFragment()

            val fragmentModel = FragmentModel(
                position,
                getTitleList()[position],
                newsFragment
            )

            fragmentList.add(fragmentModel)
        }

        return fragmentList
    }

    private fun getTitleList(): List<String> {
        val titleList = ArrayList<String>()
        titleList.add("ANASAYFA")
        titleList.add("YAZARLAR")
        titleList.add("GÜNDEM")
        titleList.add("EKONOMİ")
        titleList.add("SPOR")
        titleList.add("CADDE")
        titleList.add("EĞİTİM")
        titleList.add("TEKNOLOJİ")
        return titleList
    }

    fun getNewsList(newsListSize: Int): List<BaseNewsModel> {
        val newsList = ArrayList<BaseNewsModel>()
        repeat(newsListSize) {

            val adsModel = AdsModel(
                AdSize.BANNER,
                "ca-app-pub-3940256099942544/6300978111",
                NewsType.ADS_BANNER.id
            )

            val bigNewsModel = NewsModel(
                "https://i2.milimaj.com/i/milliyet/75/871x340/5e63f8b9554287160c0d0aff.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.BIG_NEWS.id
            )
            val smallNewsModel1 = NewsModel(
                "https://i2.milimaj.com/i/milliyet/75/871x340/5e63fb9e554287160c0d0b0a.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel2 = NewsModel(
                "https://i2.milimaj.com/i/milliyet/75/871x340/5e63eed1554287160c0d0ae0.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel3 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            val smallNewsModel4 = NewsModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                "Ertelendi! Kolay alınmış bir karar değil",
                NewsType.SMALL_NEWS.id
            )

            newsList.add(adsModel)
            newsList.add(smallNewsModel1)
            newsList.add(smallNewsModel2)
            newsList.add(smallNewsModel3)
            newsList.add(smallNewsModel4)
            newsList.add(bigNewsModel)
        }

        return newsList
    }
}
package com.example.milliyetreplica.mock


import com.example.milliyetreplica.enums.NewsType
import com.example.milliyetreplica.model.*
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

    fun getNewSliderList(sliderImageSize: Int): List<ImageModel> {
        val imageList = ArrayList<ImageModel>()
        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") Also you can add title
        val imageModel = ImageModel(
            "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
            NewsType.SLIDER.id
        )
        val imageModel2 = ImageModel(
            "https://i2.milimaj.com/i/milliyet/75/871x340/5e63f8b9554287160c0d0aff.jpg",
            NewsType.SLIDER.id
        )
        val imageModel3 = ImageModel(
            "https://i2.milimaj.com/i/milliyet/75/871x340/5e63f8b9554287160c0d0aff.jpg",
            NewsType.SLIDER.id
        )
        //  newsList.add(sliderImageModel)
//newsList.addAll(imageList)
        imageList.add(imageModel)
        imageList.add(imageModel2)
        imageList.add(imageModel3)
        return imageList
    }

    fun getNewsList(newsListSize: Int): List<BaseNewsModel> {
        val newsList = ArrayList<BaseNewsModel>()
        repeat(newsListSize) {

            //   val sliderImageModel = SliderModel("https://i2.milimaj.com/i/milliyet/75/871x340/5e63f8b9554287160c0d0aff.jpg","","",NewsType.SLIDER.id)
//            val imageList = ArrayList<SliderModel>()
            // imageList.add(SlideModel("String Url" or R.drawable)
            // imageList.add(SlideModel("String Url" or R.drawable, "title") Also you can add title
//            imageList.add(SliderModel("https://1.bp.blogspot.com/-GUZsgr8my50/XJUWOhyHyaI/AAAAAAAABUo/bljp3LCS3SUtj-judzlntiETt7G294WcgCLcBGAs/s1600/fox.jpg", 0,"",NewsType.SLIDER.id))
//            imageList.add(SliderModel("https://2.bp.blogspot.com/-CyLH9NnPoAo/XJUWK2UHiMI/AAAAAAAABUk/D8XMUIGhDbwEhC29dQb-7gfYb16GysaQgCLcBGAs/s1600/tiger.jpg",1,"",NewsType.SLIDER.id))
//            imageList.add(SliderModel("https://3.bp.blogspot.com/-uJtCbNrBzEc/XJUWQPOSrfI/AAAAAAAABUs/ZlReSwpfI3Ack60629Rv0N8hSrPFHb3TACLcBGAs/s1600/elephant.jpg", 2,"",NewsType.SLIDER.id))


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
//            val imageModel = ImageModel("https://i2.milimaj.com/i/milliyet/75/871x340/5e63f8b9554287160c0d0aff.jpg",NewsType.SLIDER.id)
            val imageModel2 = ImageModel(
                "https://imgfinans.milliyet.com.tr/i/haber/f_dfdf_321421462285.jpg",
                NewsType.SLIDER.id
            )
            //  newsList.add(sliderImageModel)
//newsList.addAll(imageList)
//            newsList.add(imageModel)
            newsList.add(imageModel2)
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
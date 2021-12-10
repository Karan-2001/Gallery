package com.example.gallery.data

import com.example.gallery.R
import com.example.gallery.model.gallery

class datasource {
    fun create():List<gallery>{
        return listOf<gallery>(
            gallery(R.drawable.image1,R.string.img_name_01,R.string.date_01,R.string.Size_01),
            gallery(R.drawable.image2,R.string.img_name_02,R.string.date_02,R.string.Size_02),
            gallery(R.drawable.image3,R.string.img_name_03,R.string.date_03,R.string.Size_03),
            gallery(R.drawable.image4,R.string.img_name_04,R.string.date_04,R.string.Size_04),
            gallery(R.drawable.image5,R.string.img_name_05,R.string.date_05,R.string.Size_05),
            gallery(R.drawable.image6,R.string.img_name_06,R.string.date_06,R.string.Size_06),
            gallery(R.drawable.image7,R.string.img_name_07,R.string.date_07,R.string.Size_07),
            gallery(R.drawable.image8,R.string.img_name_08,R.string.date_08,R.string.Size_08),
            gallery(R.drawable.image9,R.string.img_name_09,R.string.date_09,R.string.Size_09),
            gallery(R.drawable.image10,R.string.img_name_10,R.string.date_10,R.string.Size_10),


        )

    }
}
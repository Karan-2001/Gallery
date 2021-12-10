package com.example.gallery.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class gallery(@DrawableRes val imageResourceId:Int,
                   @StringRes val name_img:Int,
                   @StringRes val date:Int,
                   @StringRes val size:Int )

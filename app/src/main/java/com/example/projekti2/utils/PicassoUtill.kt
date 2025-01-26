package com.example.projekti2.utils

import android.widget.ImageView
import com.squareup.picasso.Picasso

object PicassoUtil {

    fun loadImage(url: String, imageView: ImageView) {
        Picasso.get().load(url).into(imageView)
    }
}

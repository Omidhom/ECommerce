package com.example.ecommerceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_downloading_image.*

class DownloadingImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloading_image)

        btnDownloadImage.setOnClickListener {

            val imageURL = "http://10.77.7.1:88/cat.jpeg"
            Picasso.get().load("http://10.77.7.1:88/cat.jpeg").into(imgDownloadedImage)
        }
    }
}
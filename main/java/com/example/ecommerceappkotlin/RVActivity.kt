package com.example.ecommerceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_r_v.*

class RVActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_v)

        var myProductsList = ArrayList<EProducts>()
        myProductsList.add(EProducts(0, "iPhone" , 2000 , R.drawable.iphone))
        myProductsList.add(EProducts(1, "iPad" , 1000 , R.drawable.ipad))
        myProductsList.add(EProducts(2, "iPod Nano" , 800 , R.drawable.ipodnano))
        myProductsList.add(EProducts(3, "iPod Shuffle" , 900 , R.drawable.ipodshuffle))
        myProductsList.add(EProducts(4, "iPod Touch" , 1100 , R.drawable.ipodtouch))
        myProductsList.add(EProducts(5, "MacBook" , 3000 , R.drawable.macbook))

        var rvAdapter = RVAdapter(this@RVActivity , myProductsList)
        recyclerView.layoutManager = LinearLayoutManager(this@RVActivity)
        recyclerView.adapter = rvAdapter


    }
}
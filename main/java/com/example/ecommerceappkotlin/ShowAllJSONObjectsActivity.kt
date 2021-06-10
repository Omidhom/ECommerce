package com.example.ecommerceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_show_all_j_s_o_n_objects.*

class ShowAllJSONObjectsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_j_s_o_n_objects)

        txtAllProducts.setOnClickListener {

            val allProductsURL = "http://10.130.22.1:88//Ecommerce/present_json_array.php"
            var allProductsString: String = ""
            val requestQ: RequestQueue = Volley.newRequestQueue(this@ShowAllJSONObjectsActivity)
            var jsonAR = JsonArrayRequest(Request.Method.GET, allProductsURL, null,
            Response.Listener { response ->

                for(productIndex in 0.until(response.length())) {
                    allProductsString += response.getJSONObject(productIndex).getString("name")+
                            " - " + response.getJSONObject(productIndex).getInt("price") + "\n"

                }

                txtAllProducts.text = allProductsString

            }, Response.ErrorListener { error ->

                    txtAllProducts.text = error.message

                })

            requestQ.add(jsonAR)
        }
    }
}
package com.example.recyleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class FruitDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_overview)
        val fruitDetails = intent.getParcelableExtra<Fruit>("Fruit")
        val fruitTextDetails: TextView = findViewById(R.id.fruit_details)
        if (fruitDetails != null) {
            fruitTextDetails.text = fruitDetails.shortDescription.toString()
        }
        //val res : Int = intent.getIntExtra("Fruit", -1);
        //fruitLabel.setImageResource(res)

//        val fruitOverviewText : TextView = findViewById(R.id.overviewTitle)
//
//        val fruitLabel : ImageView =findViewById(R.id.fruit_poster)
    }
}
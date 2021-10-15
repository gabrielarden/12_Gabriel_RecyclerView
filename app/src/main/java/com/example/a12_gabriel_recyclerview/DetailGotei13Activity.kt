package com.example.a12_gabriel_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailGotei13Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gotei13)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val gotei13 = intent.getParcelableExtra<Gotei13>(MainActivity.INTENT_PARCELABLE)

        val imgGotei13 = findViewById<ImageView>(R.id.img_item_photo)
        val nameGotei13 = findViewById<TextView>(R.id.tv_item_name)
        val descGotei13 = findViewById<TextView>(R.id.tv_item_description)

        imgGotei13.setImageResource(gotei13?.imgGotei13!!)
        nameGotei13.text = gotei13.nameGotei13
        descGotei13.text = gotei13.descGotei13
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
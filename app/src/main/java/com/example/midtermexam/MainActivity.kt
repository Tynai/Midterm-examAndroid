package com.example.midtermexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = ApplicationRecyclerViewAdapter(getFruits().apply {
            addAll(getFruits())
            addAll(getFruits())
        })
    }

    private fun getFruits() = arrayListOf(
        App("Naruto", "32 age","Air","Installed", R.drawable.naruto, R.drawable.rating_black  ),
        App("Kakashi", "46 age","light", "Free",R.drawable.kakashi, R.drawable.rating_black),
        App("Gaara", "32 age","sand", "Update",R.drawable.gaara, R.drawable.rating_black),
        App("Sakura", "32 age","physical power", "Update",R.drawable.sakura, R.drawable.rating_black),
        App("Sarada", "15 age","light", "Update",R.drawable.sarada, R.drawable.rating_black),
        App("Mitsuke", "15 age ","light", "Update",R.drawable.mitsuke, R.drawable.rating_black),
        App("Hinata", "32 age ","physical", "Update",R.drawable.hinata, R.drawable.rating_black),
        App("Kiba", "32 age","transformation", "Update",R.drawable.kiba, R.drawable.rating_black),
        App("Shino", "32 age","bug", "Update",R.drawable.shino, R.drawable.rating_black),
        App("Kurenai", "42 age","illusions", "Update",R.drawable.kurenai, R.drawable.rating_black)






    )
}
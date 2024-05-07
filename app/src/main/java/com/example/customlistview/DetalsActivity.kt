package com.example.customlistview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class DetalsActivity : AppCompatActivity() {
    lateinit var profileName: TextView
    lateinit var profileDesc: TextView
    lateinit var profileImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detals)
        profileName = findViewById(R.id.PeofileName)
        profileDesc = findViewById(R.id.profileDesc)
        profileImg = findViewById(R.id.profileImg)

        val name = intent.getStringExtra("name")
        val desc = intent.getStringExtra("desc")
        val imgResId = intent.getIntExtra("image", R.drawable.musfiquerahim)

        profileName.text = name
        profileDesc.text = desc
        profileImg.setImageResource(imgResId)
    }
}

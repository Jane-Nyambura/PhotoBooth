package com.example.photobooth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class PhotoDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_details)

        var text=intent.getStringExtra("text")
        var imageUrl=intent.getStringExtra("image")


        var intentText=findViewById<TextView>(R.id.tvtext)
        var ivimage=findViewById<ImageView>(R.id.ivimage)


        Picasso.get()
            .load(imageUrl)
            .resize(200,200)
            .centerCrop()
            .into(ivimage)
        intentText.text=text




//        Toast.makeText(baseContext, "name", Toast.LENGTH_SHORT).show
    }
}

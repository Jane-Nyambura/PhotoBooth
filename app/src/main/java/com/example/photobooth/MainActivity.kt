package com.example.photobooth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvPhotos: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayPhotos()
    }
    fun displayPhotos(){
        var photoList= listOf(
           Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
            Photos("You don't need a silver fork to eat good food","https://www.pexels.com/photo/pancake-with-honey-on-plate-357573/"),
        )
        rvPhotos=findViewById(R.id.rvPhoto)
        var PhotoAdapter=PhotoAdapter(photoList,baseContext)
        rvPhotos.layoutManager= LinearLayoutManager(baseContext)
        rvPhotos.adapter=PhotoAdapter

    }
}

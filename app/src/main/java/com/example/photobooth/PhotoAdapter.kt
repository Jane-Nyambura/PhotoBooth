package com.example.photobooth

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class PhotoAdapter(var photoList: List<Photos>, var context: Context): RecyclerView.Adapter<PhotosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.photo_list_item,parent,false)
        return  PhotosViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        var currentPhotos=photoList.get(position)
        holder.tvtext.text= currentPhotos.tvtext.toString()


        holder.cvPhotos.setOnClickListener{
            var intent= Intent(context,PhotoDetails::class.java)
            intent.putExtra("name",currentPhotos.tvtext)
            intent.putExtra("image",currentPhotos.tvtext)
            context.startActivity(intent)
        }

        Picasso.get()
            .load(currentPhotos.imageUrl)
            .resize(100,100)
            .centerCrop()
            .into(holder.ivPhoto)
    }

    override fun getItemCount(): Int {
        return photoList.size
    }
}

class PhotosViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvtext=itemView.findViewById<TextView>(R.id.tvtext)
    var ivPhoto=itemView.findViewById<ImageView>(R.id.ivPhoto)
    var cvPhotos=itemView.findViewById<CardView>(R.id.cvPhotos)
}

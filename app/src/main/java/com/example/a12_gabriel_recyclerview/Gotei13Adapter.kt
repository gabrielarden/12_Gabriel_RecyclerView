package com.example.a12_gabriel_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Gotei13Adapter(private val context: Context, private val Gotei13: List<Gotei13>, val listener: (Gotei13) -> Unit)
    : RecyclerView.Adapter<Gotei13Adapter.Gotei13ViewHolder>(){

    class Gotei13ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imgGotei13 = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameGotei13 = view.findViewById<TextView>(R.id.tv_item_name)
        val descGotei13 = view.findViewById<TextView>(R.id.tv_item_description)

        fun  bindView(gotei13: Gotei13, listener: (Gotei13) -> Unit){
            imgGotei13.setImageResource(gotei13.imgGotei13)
            nameGotei13.text = gotei13.nameGotei13
            descGotei13.text = gotei13.descGotei13
            itemView.setOnClickListener{
                listener(gotei13)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Gotei13ViewHolder {
        return Gotei13ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_gotei13, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Gotei13ViewHolder, position: Int) {
        holder.bindView(Gotei13[position], listener)
    }

    override fun getItemCount(): Int = Gotei13.size

}
package com.example.mykeyboarddemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mykeyboarddemo.R
import com.example.mykeyboarddemo.model.EmojiData

class EmojiAdapter (
    var context: Context , var arrayList: ArrayList<EmojiData>
): RecyclerView.Adapter<EmojiAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.gridviewlayout,parent,false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount() = arrayList.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        val mEmoji : EmojiData = arrayList.get(position)

        holder.mImage.setImageResource(mEmoji.image)
        holder.mTitle.text = mEmoji.title
        
        holder.mImage.setOnClickListener {
            Toast.makeText(context, "You Clicked Photo", Toast.LENGTH_SHORT).show();
        }

        var nowCurrent = holder.adapterPosition
        when (nowCurrent){
            100 -> {
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
            200->{
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
            300->{
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
            400 ->{
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
            500 ->{
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
            600-> {
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
            700->{
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
            800->{
                Toast.makeText(context, "$nowCurrent", Toast.LENGTH_SHORT).show();
            }
        }
    }

    class ItemHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        var mTitle = itemview.findViewById<TextView>(R.id.myTitleView)!!
        var mImage = itemview.findViewById<ImageView>(R.id.myImageView)!!
    }

}


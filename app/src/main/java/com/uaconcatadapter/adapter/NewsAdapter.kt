package com.uaconcatadapter.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uaconcatadapter.R
import com.uaconcatadapter.data.News
import load

class NewsAdapter(private val news: List<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newsItem = news[position]
        holder.bind(newsItem)
    }

    override fun getItemCount(): Int {
        return news.size
    }

    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(news: News) {
            val picture: ImageView = itemView.findViewById(R.id.picture)
            picture.load(news.pictureUrl)

            val title: TextView = itemView.findViewById(R.id.tile)
            title.text = news.title

            val topic: TextView =
                itemView.findViewById(R.id.topic)
            topic.text = news.topic


        }

    }
}
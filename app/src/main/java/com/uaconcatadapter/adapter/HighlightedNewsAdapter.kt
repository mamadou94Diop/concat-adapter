package com.uaconcatadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uaconcatadapter.R
import com.uaconcatadapter.data.News
import load

class HighlightedNewsAdapter(private val highlightedNews: List<News>) :
    RecyclerView.Adapter<HighlightedNewsAdapter.HighlightedNewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighlightedNewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_highlighted_news, parent, false)
        return HighlightedNewsAdapter.HighlightedNewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: HighlightedNewsViewHolder, position: Int) {
        val highlightedNewsItem = highlightedNews[position]
        holder.bind(highlightedNewsItem)    }

    override fun getItemCount(): Int {
        return highlightedNews.size
    }


    class HighlightedNewsViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(news: News) {
            val picture: ImageView = itemView.findViewById(R.id.news_picture)
            picture.load(news.pictureUrl)

            val title: TextView = itemView.findViewById(R.id.news_title)
            title.text = news.title

            val topic: TextView =
                itemView.findViewById(R.id.news_topic)
            topic.text = news.topic
        }
    }
}
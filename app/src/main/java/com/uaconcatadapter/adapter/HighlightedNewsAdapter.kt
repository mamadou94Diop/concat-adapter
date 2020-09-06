package com.uaconcatadapter.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uaconcatadapter.data.News

class HighlightedNewsAdapter(private val highlightedNews: List<News>) :
    RecyclerView.Adapter<HighlightedNewsAdapter.HighlightedNewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HighlightedNewsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HighlightedNewsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return highlightedNews.size
    }


    class HighlightedNewsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}
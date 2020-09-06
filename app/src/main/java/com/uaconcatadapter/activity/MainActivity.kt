package com.uaconcatadapter.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import com.uaconcatadapter.R
import com.uaconcatadapter.adapter.HighlightedNewsAdapter
import com.uaconcatadapter.adapter.NewsAdapter
import com.uaconcatadapter.data.News
import com.uaconcatadapter.data.highlightedNews
import com.uaconcatadapter.data.otherNews
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ConcatAdapter
    lateinit var data : List<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        data = News.getData()
        val otherNewsAdapter = NewsAdapter(data.otherNews())
        val highlightedNewsAdapter = HighlightedNewsAdapter(data.highlightedNews())
        adapter = ConcatAdapter()
        adapter.addAdapter(highlightedNewsAdapter)
        adapter.addAdapter(otherNewsAdapter)
        recycler_news.adapter = adapter



    }
}
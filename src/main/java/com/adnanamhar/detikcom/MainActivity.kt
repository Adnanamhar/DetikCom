package com.adnanamhar.detikcom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.adnanamhar.detikcom.NewsAdapter.NewsAdapter
import com.adnanamhar.detikcom.NewsAdapter.NewsModel
import com.adnanamhar.detikcom.NewsAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    private lateinit var newsAdapter: NewsAdapter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region Headline

        var headline_news: news?
        if (NewsModel.newslist.size>0){
            headline_news = NewsModel.newslist[NewsModel.newslist.size-1]
            tvw_Titleheadline.setText(headline_news.title)
            tvw_DescHeadline.setText(headline_news.desc)
            img_news0.setImageResource(headline_news.photo)

            cdv_newsheadline.setOnClickListener{
                val intent_detail = Intent (this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headline_news.title)
                        putExtra(DetailActivity.cont_PhotoNews, headline_news.photo.toString())
                }
                startActivity(intent_detail)
                finish()
            }
        }
        //endregion


        //region Daftar Berita

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager
        
        newsAdapter = NewsAdapter(this,NewsModel.newslist)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallback(object : NewsAdapter.OnItemClickCallback{
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                        putExtra(DetailActivity.cont_Deskripsi,data.desc.toString())

                    }
                startActivity(intent)
                finish()
            }
        })
        //endregion

    }
}

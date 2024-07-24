package com.geeks.news

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private  lateinit var newArrayList: ArrayList<News>
    lateinit var imageId :Array<Int>
    lateinit var heading: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news5,
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news1,
        )

        heading = arrayOf(
            "Виктория Бекхэм разозлилась на мужа из-за фильтра на фото",
            "С депрессивным медведем попросили нe фотографироваться",
            "Женщина выиграла иск против покашлявшего на нее босса Об этом сообщает",
            "Снуп Догг будет нести факел Олимпиады-2024",
            "Самый масштабный компьютерный сбой в истории вызвал хаос по всему миру. Как это было?",
            "Виктория Бекхэм разозлилась на мужа из-за фильтра на фото",
            "С депрессивным медведем попросили нe фотографироваться",
            "Женщина выиграла иск против покашлявшего на нее босса Об этом сообщает",
            "Снуп Догг будет нести факел Олимпиады-2024",
            "Самый масштабный компьютерный сбой в истории вызвал хаос по всему миру. Как это было?",
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserData()
    }

    private fun getUserData() {

        for (i in imageId.indices){
            val news = News (imageId[i], heading[i])
            newArrayList.add(news)
        }

        newRecyclerView.adapter= MyAdapter(newArrayList)
    }
}
package com.example.mykeyboarddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mykeyboarddemo.adapter.EmojiAdapter
import com.example.mykeyboarddemo.model.EmojiData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     var mRecyclerView: RecyclerView ? = null
    var mGridLayoutManager : GridLayoutManager ? = null
    var arrayList : ArrayList<EmojiData> ? = null
    var mEmojiAdapter : EmojiAdapter ? = null
    lateinit var mBtn1 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.myRecyclerView)
        mBtn1 = findViewById(R.id.myBtn1)
        mBtn1.setOnClickListener {
            Toast.makeText(applicationContext, "I'm Btn clicked", Toast.LENGTH_SHORT).show();
        }
        mGridLayoutManager = GridLayoutManager(
            applicationContext,
            4,
            LinearLayoutManager.HORIZONTAL,
            false
        )

        mRecyclerView?.layoutManager = mGridLayoutManager
        mRecyclerView?.setHasFixedSize(true)

        arrayList = ArrayList()
        arrayList = setDataInList()
        mEmojiAdapter = EmojiAdapter(applicationContext,arrayList!!)
        myRecyclerView?.adapter = mEmojiAdapter

    }

    fun setDataInList() : ArrayList<EmojiData>{
        var items: ArrayList<EmojiData> = ArrayList()
        var n : Int = 0
        for (n in 0..800)
        items.add(EmojiData("Hello $n", R.drawable.ic_account_circle))

        return items
    }
}

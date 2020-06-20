package com.AutoUpdateApp.UpdateRecycleList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.AutoUpdateApp.R
import kotlinx.android.synthetic.main.activity_main.*


//Updates Page
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(500)
        recycler_view.adapter =
            ExampleAdapter(exampleList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    private fun generateDummyList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_update
                1 -> R.drawable.ic_update2
                else -> R.drawable.ic_update3
            }
            val item = ExampleItem(
                drawable,
                "New Update $i",
                "Install Link"
            )
            list += item
        }
        return list
    }

}



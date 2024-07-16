package com.example.task4androidcourse

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.task4androidcourse.databinding.ActivityTimeLineBinding

class TimeLineActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityTimeLineBinding

    lateinit var recyclerViewTimeLine : RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_line)

        recyclerViewTimeLine = findViewById<RecyclerView>(R.id.post_scroll_recycle_view)

        recyclerViewTimeLine.layoutManager = LinearLayoutManager(this)

        val adaptor = TimeLineAdaptor(recyclerViewTimeLine);

        recyclerViewTimeLine.adapter = adaptor;
    }


}
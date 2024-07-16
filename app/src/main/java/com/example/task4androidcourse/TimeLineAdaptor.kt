package com.example.task4androidcourse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task4androidcourse.data.PostsData


class TimeLineAdaptor(itemView : View) : RecyclerView.Adapter<TimeLineAdaptor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_post ,parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return  PostsData.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = PostsData[position];
        holder.accountUserName.text = item.userName;
        holder.postContent.text = item.content
        holder.likeCount.text = item.like.toString();
        holder.shareCount.text = item.share.toString();
    }

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        //    var userProfileImage : ImageView = itemView.findViewById(R.id.)
        val accountUserName : TextView = itemView.findViewById(R.id.account_name);
        val postContent : TextView = itemView.findViewById(R.id.post_content)
        val likeCount : TextView = itemView.findViewById(R.id.Like_count_text);
        val shareCount : TextView = itemView.findViewById(R.id.share_count_text);
    }

}
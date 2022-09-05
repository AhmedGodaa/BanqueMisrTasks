package com.banquemisr.recyclerviewtask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.banquemisr.recyclerviewtask.databinding.ItemContainerPostBinding


class PostAdapter(data: ArrayList<Post>, listener: PostListener) :
    RecyclerView.Adapter<PostAdapter.PostHolder>() {
    var data: ArrayList<Post>
    var listener: PostListener


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding: ItemContainerPostBinding =
            ItemContainerPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.setPostData(data[position], position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class PostHolder(itemContainerPostBinding: ItemContainerPostBinding) :
        RecyclerView.ViewHolder(itemContainerPostBinding.getRoot()) {
        var binding: ItemContainerPostBinding
        fun setPostData(post: Post, position: Int) {
            listener.onClick(post, position)
            binding.imagePost.setImageResource(post.postImage)
            binding.imageUser.setImageResource(post.userImage)
//            binding.textContent.setText(post.textContent)
        }

        init {
            binding = itemContainerPostBinding
        }
    }

    init {
        this.data = data
        this.listener = listener
    }
}


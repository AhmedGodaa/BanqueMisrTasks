package com.banquemisr.recyclerviewtask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.banquemisr.recyclerviewtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), PostListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        oldRecyclerView()

    }

    private fun oldRecyclerView() {
        val posts = ArrayList<Post>()
        posts.add(Post("hello every body and welcome", R.drawable.im_bill, R.drawable.im_microsoft))
        posts.add(Post("hello every body and welcome", R.drawable.im_elon, R.drawable.im_tesla))
        posts.add(Post("hello every body and welcome", R.drawable.im_jeff, R.drawable.im_elon))
        posts.add(Post("hello every body and welcome", R.drawable.im_steve, R.drawable.im_apple))
        val adapter = PostAdapter(posts, this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(baseContext)
    }

    override fun onClick(post: Post?, position: Int) {
        Toast.makeText(this, "Post Clicked ", Toast.LENGTH_LONG).show()
    }
}
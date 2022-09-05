package com.banquemisr.fragmentrecyclerviewtask.adapters

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.banquemisr.fragmentrecyclerviewtask.adapters.UserAdapter.UserViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import com.banquemisr.fragmentrecyclerviewtask.models.User
import com.banquemisr.fragmentrecyclerviewtask.listeners.UserListener
import com.banquemisr.fragmentrecyclerviewtask.databinding.ItemContainerUserBinding
import java.util.ArrayList

class UserAdapter(
    private val data: ArrayList<User>,
    private val context: Context,
    private val modelListener: UserListener
) : RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemContainerUserBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val (username, email, phone) = data[position]
        holder.setUserData(data[position], position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class UserViewHolder(var binding: ItemContainerUserBinding) :
        RecyclerView.ViewHolder(
            binding.root
        ) {

        fun setUserData(model: User, position: Int) {
            binding.root.setOnClickListener {
                modelListener.onClick(model, position)
            }
            binding.name.text = model.name
            binding.email.text = model.email
            binding.telephone.text = model.telephone

        }
    }
}
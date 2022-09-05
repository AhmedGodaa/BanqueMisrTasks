package com.banquemisr.fragmentrecyclerviewtask.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.banquemisr.fragmentrecyclerviewtask.models.User
import com.banquemisr.fragmentrecyclerviewtask.R
import com.banquemisr.fragmentrecyclerviewtask.adapters.UserAdapter
import com.banquemisr.fragmentrecyclerviewtask.databinding.FragmentUserBinding
import com.banquemisr.fragmentrecyclerviewtask.listeners.UserListener
import com.banquemisr.fragmentrecyclerviewtask.utils.Constants

class UserFragment : Fragment(), UserListener {
    lateinit var binding: FragmentUserBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserBinding.inflate(layoutInflater)
        callRecyclerView()

        return binding.root
    }

    private fun callRecyclerView() {
        val posts = ArrayList<User>()
        posts.add(
            User(
                name = "Karim",
                email = "Karim@gmail.com",
                age = "1",
                job = "Software Engineer",
                telephone = "123456"
            )
        )
        posts.add(
            User(
                name = "Youssef",
                email = "Youssef@gmail.com",
                age = "1",
                job = "Software Engineer",
                telephone = "123456"
            )
        )

        for (i in 1..20) {
            posts.add(
                User(
                    name = "User Number: $i",
                    email = "Email Number: $i",
                    age = "Age Number: $i",
                    job = "Software Engineer",
                    telephone = "123456"
                )
            )
        }

        val adapter = UserAdapter(posts, requireContext(), this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }


    override fun onClick(user: User, position: Int) {
        val dataFragment = DetailsFragment()

        val bundle = Bundle()
        bundle.putString(Constants.NAME, user.name)
        bundle.putString(Constants.EMAIL, user.email)
        bundle.putString(Constants.AGE, user.age)
        bundle.putString(Constants.JOB, user.job)
        bundle.putString(Constants.TELEPHONE, user.telephone)
        dataFragment.arguments = bundle

        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainerView, dataFragment)
            ?.commit()
    }


}
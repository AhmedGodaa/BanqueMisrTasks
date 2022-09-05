package com.banquemisr.fragmentrecyclerviewtask.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.banquemisr.fragmentrecyclerviewtask.databinding.FragmentDataBinding
import com.banquemisr.fragmentrecyclerviewtask.utils.Constants


class FragmentData : Fragment() {

    lateinit var binding: FragmentDataBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDataBinding.inflate(layoutInflater)
        binding.textName.text = "Name: " + arguments?.getString(Constants.NAME)
        binding.textEmail.text = "Email: " + arguments?.getString(Constants.EMAIL)
        binding.textAge.text = "Age: " + arguments?.getString(Constants.AGE)
        binding.textTelephone.text = "Telephone: " + arguments?.getString(Constants.TELEPHONE)
        binding.textJob.text = "Job" + arguments?.getString(Constants.JOB)






        return binding.root
    }



}
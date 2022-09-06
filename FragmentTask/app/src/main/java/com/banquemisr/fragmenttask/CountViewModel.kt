package com.banquemisr.fragmenttask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    private var i = 0


    private var _count = MutableLiveData(0)
    val count: LiveData<Int>  = _count


    fun increment() {
        i++
        _count.value = i

    }

}
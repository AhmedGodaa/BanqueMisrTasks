package com.banquemisr.fragmentrecyclerviewtask.listeners

import com.banquemisr.fragmentrecyclerviewtask.models.User

interface UserListener {
    fun onClick(user: User, position: Int)

}
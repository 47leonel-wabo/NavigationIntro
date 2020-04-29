package com.aiwamob.navigationintro.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.aiwamob.navigationintro.R
import com.aiwamob.navigationintro.databinding.FragmentTaskTwoBinding

/**
 * A simple [Fragment] subclass.
 */
class TaskTwoFragment : Fragment() {

    private lateinit var taskTwoBinding: FragmentTaskTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        taskTwoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_task_two, container, false)


        return taskTwoBinding.root
    }

}

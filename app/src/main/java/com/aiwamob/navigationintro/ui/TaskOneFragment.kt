package com.aiwamob.navigationintro.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.aiwamob.navigationintro.R
import com.aiwamob.navigationintro.databinding.FragmentTaskOneBinding

/**
 * A simple [Fragment] subclass.
 */
class TaskOneFragment : Fragment() {

    private lateinit var tOneBinding: FragmentTaskOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tOneBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_task_one, container, false)

        return tOneBinding.root
    }

}

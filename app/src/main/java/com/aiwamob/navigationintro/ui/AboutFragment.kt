package com.aiwamob.navigationintro.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.aiwamob.navigationintro.R
import com.aiwamob.navigationintro.databinding.FragmentAboutBinding

class AboutFragment: Fragment() {

    private lateinit var aboutBinding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aboutBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)


        return aboutBinding.root
    }

}
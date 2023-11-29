package com.example.hand

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hand.databinding.FragmentLuckBinding

class LuckFragment : Fragment() {
    private lateinit var binding : FragmentLuckBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = FragmentLuckBinding.inflate(inflater,container, false)
            return binding.root
    }

    companion object {
      @JvmStatic
        fun newInstance()=LuckFragment()

    }
}
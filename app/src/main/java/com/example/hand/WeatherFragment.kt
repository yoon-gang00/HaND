package com.example.hand

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hand.databinding.FragmentMyBinding
import com.example.hand.databinding.FragmentWeatherBinding

class  WeatherFragment : Fragment() {
   private lateinit var binding: FragmentWeatherBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View?{
        binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance()=WeatherFragment()
    }
}
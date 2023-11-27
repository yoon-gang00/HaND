package com.example.hand

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [MyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var nameEditText: EditText
    private lateinit var dateOfBirthEditText: EditText
    private lateinit var timeOfBirthEditText: EditText
    private lateinit var genderEditText: EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {
        val view = inflater.inflate(R.layout.fragment_my, container, false)

        nameEditText = view.findViewById(R.id.nameEditText)
        dateOfBirthEditText = view.findViewById(R.id.dateOfBirthEditText)
        timeOfBirthEditText = view.findViewById(R.id.timeOfBirthEditText)
        genderEditText = view.findViewById(R.id.genderEditText)

        return view
    }



    companion object {
        @JvmStatic
        fun newInstance() = MyFragment()
    }
}
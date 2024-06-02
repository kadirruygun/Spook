package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.proje.databinding.FragmentFirstPageBinding

class FirstPageFragment : Fragment() {

    private lateinit var binding: FragmentFirstPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstPageBinding.inflate(inflater,container,false)

        binding.futbolbutton.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_firstPageFragment_to_futbolFragment)
        }

        binding.button2.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_firstPageFragment_to_secondPageFragment)
        }

        binding.button4.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_firstPageFragment_to_thirdPageFragment)
        }

        return binding.root
    }

}
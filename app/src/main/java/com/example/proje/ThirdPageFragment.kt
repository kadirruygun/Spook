package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.proje.databinding.FragmentSecondPageBinding
import com.example.proje.databinding.FragmentThirdPageBinding

class ThirdPageFragment : Fragment() {

    private lateinit var binding: FragmentThirdPageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdPageBinding.inflate(inflater,container,false)

        binding.button11.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button29.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button30.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button31.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button32.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button33.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button34.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button35.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button36.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button37.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button38.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        binding.button39.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_thirdPageFragment_to_onay)
        }

        return binding.root
    }


}
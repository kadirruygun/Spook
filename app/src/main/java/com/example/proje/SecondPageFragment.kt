package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.proje.databinding.FragmentFirstPageBinding
import com.example.proje.databinding.FragmentSecondPageBinding

class SecondPageFragment : Fragment() {

    private lateinit var binding: FragmentSecondPageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSecondPageBinding.inflate(inflater,container,false)

        binding.button10.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button9.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button19.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button20.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button21.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button22.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button23.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button24.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button25.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button26.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button27.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }

        binding.button28.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_secondPageFragment_to_onay)
        }


        return binding.root
    }

}
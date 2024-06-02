package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.proje.databinding.FragmentFirstPageBinding
import com.example.proje.databinding.FragmentFutbolBinding

class FutbolFragment : Fragment() {

    private lateinit var binding: FragmentFutbolBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFutbolBinding.inflate(inflater,container,false)

        binding.button87.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.saatbutton.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button5.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button6.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button7.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button8.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button12.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button13.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button14.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button15.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button16.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button17.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }

        binding.button18.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_futbolFragment_to_onay)
        }


        return binding.root
    }


}
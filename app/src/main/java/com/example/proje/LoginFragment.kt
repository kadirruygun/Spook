package com.example.proje

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.example.proje.databinding.ActivityMainBinding
import com.example.proje.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater,container,false)

        binding.button3.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_firstPageFragment)
        }

        return binding.root
    }
}
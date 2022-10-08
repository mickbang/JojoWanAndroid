package com.lq.feature_register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.lq.feature_register.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var _binding: FragmentRegisterBinding
    private val _viewModel: RegisterViewModel by viewModels()

    companion object {
        fun newInstance() = RegisterFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return _binding.root
    }
}
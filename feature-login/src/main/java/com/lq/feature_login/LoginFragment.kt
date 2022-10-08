package com.lq.feature_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.lq.feature_login.databinding.FragmentLoginBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LoginFragment : Fragment() {
    private lateinit var _binding:FragmentLoginBinding
    companion object {
        fun newInstance() = LoginFragment()
    }

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        lifecycleScope.launch {
            viewModel.uiState.collect{
                if (it.isLoading) {

                }else{

                }
            }
        }
    }

    private fun initView() {
        _binding.apply {
            btnLogin.setOnClickListener {
                viewModel.login()
            }
        }
    }
}
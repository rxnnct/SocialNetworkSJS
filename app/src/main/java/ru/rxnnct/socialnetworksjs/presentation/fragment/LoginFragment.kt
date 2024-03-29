package ru.rxnnct.socialnetworksjs.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.socialnetworksjs.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private val viewModel: LoginViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.intentForRegister.observe(viewLifecycleOwner) {
            startActivity(it)
        }

        val registerButton = binding.bRegister
        registerButton.setOnClickListener {
            viewModel.register()
        }
    }

//    companion object {
//        @JvmStatic
//        fun newInstance() = LoginFragment()
//    }
}
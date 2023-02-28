package com.example.socialnetworksjs.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.socialnetworksjs.R
import com.example.socialnetworksjs.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val registerButton = binding.bRegister
        registerButton.setOnClickListener {
            startActivity(getIntentForRegister())
        }
    }

    private fun getIntentForRegister(): Intent {
        val url = getString(R.string.register_url)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        return intent
    }

    companion object {
        @JvmStatic
        fun newInstance() = LoginFragment()
    }
}
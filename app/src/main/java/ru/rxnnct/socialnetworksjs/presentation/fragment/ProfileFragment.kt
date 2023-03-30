package ru.rxnnct.socialnetworksjs.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.socialnetworksjs.R
import com.example.socialnetworksjs.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    // TODO: remove
    private val isLogged = false

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: remove
        val navController = findNavController()
        if (!isLogged) {
            navController.navigate(R.id.loginFragment)
        }
    }

//    companion object {
//        @JvmStatic
//        fun newInstance() = ProfileFragment()
//    }
}
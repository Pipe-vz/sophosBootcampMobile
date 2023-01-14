package com.example.sophosmobileproject.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sophosmobileproject.R
import com.example.sophosmobileproject.databinding.FragmentSendBinding

class SendFragment : Fragment() {

    private var _binding: FragmentSendBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSendBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener{
            findNavController().navigate(R.id.action_sendFragment_to_menuFragment)
        }
        //        binding.menu.setOnClickListener{
//            findNavController().navigate(R.id.xxxx)
//        }
//        binding.photo.setOnClickListener{
//            findNavController().navigate(R.id.)
//        }
//        binding.loadDocument.setOnClickListener{
//            findNavController().navigate(R.id.)
//        }
//        binding.send.setOnClickListener{
//            findNavController().navigate(R.id.)
//        }
    }
}
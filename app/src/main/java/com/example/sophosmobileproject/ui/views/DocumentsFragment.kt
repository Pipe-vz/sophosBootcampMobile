package com.example.sophosmobileproject.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sophosmobileproject.R
import com.example.sophosmobileproject.databinding.FragmentDocumentsBinding


class DocumentsFragment : Fragment() {

    private var _binding:FragmentDocumentsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDocumentsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //        binding.menu.setOnClickListener{
//            findNavController().navigate(R.id.xxxx)
//        }
        binding.btnBack.setOnClickListener{
            findNavController().navigate(R.id.action_documentsFragment_to_menuFragment)
        }
    }
}
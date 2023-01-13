package com.example.sophosmobileproject.ui.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.sophosmobileproject.databinding.ActivityMainBinding
import com.example.sophosmobileproject.ui.login.LoginFragment
import com.example.sophosmobileproject.ui.viewmodel.DocumentsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val documentsViewModel: DocumentsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace<LoginFragment>(binding.frameContainer,)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }


//        documentsViewModel.onCreate()
//
//        documentsViewModel.documentsModel.observe(this, Observer {
//            binding.tvQuote.text = it.Nombre
//            binding.tvAuthor.text = it.Apellido
//            binding.documents
//        })
//        documentsViewModel.isLoading.observe(this, Observer {
//            binding.loading.isVisible = it
//        })

//        documentsViewModel.documentsModel.observe(this, observer {
//            binding.
//        })

    }



}




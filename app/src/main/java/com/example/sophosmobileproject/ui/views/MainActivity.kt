package com.example.sophosmobileproject.ui.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sophosmobileproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


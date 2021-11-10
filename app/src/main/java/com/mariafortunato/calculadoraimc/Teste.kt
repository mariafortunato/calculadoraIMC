package com.mariafortunato.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariafortunato.calculadoraimc.databinding.ActivityTesteBinding

class Teste : AppCompatActivity() {
    private lateinit var binding: ActivityTesteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityTesteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
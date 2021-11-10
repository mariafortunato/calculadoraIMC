package com.mariafortunato.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mariafortunato.calculadoraimc.databinding.ActivityInformacoesBinding
import com.mariafortunato.calculadoraimc.databinding.ActivityMainBinding

class InformacoesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInformacoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacoes)

        binding = ActivityInformacoesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
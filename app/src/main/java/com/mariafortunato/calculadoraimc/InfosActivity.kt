package com.mariafortunato.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariafortunato.calculadoraimc.databinding.ActivityInfosBinding

class InfosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infos)

        binding = ActivityInfosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.mariafortunato.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariafortunato.calculadoraimc.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMainCalcular.setOnClickListener {
            val editAltura = binding.editMainAltura.text.toString().trim()
            val editPeso = binding.editMainPeso.text.toString().trim()

            if (editAltura.isEmpty()){
                binding.editMainAltura.error = "Campo obrigatorio"
                binding.editMainAltura.requestFocus()
            } else if (editPeso.isEmpty()){
                binding.editMainPeso.error = "Campo obrigatorio"
                binding.editMainPeso.requestFocus()
            } else {
                val altura = editAltura.toFloat()
                val peso = editPeso.toFloat()
                val imc = peso / (altura*altura)
                val decimal = DecimalFormat("##.##")

                if (imc < 18.5) {
                    binding.txtResultado.text = "Seu IMC é: ${decimal.format(imc)}. \nAbaixo do peso"
                    binding.txtResultado.setBackgroundResource(R.drawable.txt_abaixo_acima_peso)
                } else if (imc >= 18.5 && imc < 25) {
                    binding.txtResultado.text = "Seu IMC é: ${decimal.format(imc)}. \nPeso ideal"
                    binding.txtResultado.setBackgroundResource(R.drawable.txt_peso_ideal)
                } else if (imc >= 25 && imc < 30){
                    binding.txtResultado.text = "Seu IMC é: ${decimal.format(imc)}. \nSobrepeso"
                    binding.txtResultado.setBackgroundResource(R.drawable.txt_sobrepeso)
                } else {
                    binding.txtResultado.text = "Seu IMC é: ${decimal.format(imc)}. \nObesidade"
                    binding.txtResultado.setBackgroundResource(R.drawable.txt_abaixo_acima_peso)
                }
            }
        }
        binding.btnMainLimpar.setOnClickListener{
            binding.editMainAltura.setText("")
            binding.editMainPeso.setText("")
            binding.txtResultado.setText("")
            binding.txtResultado.setBackgroundResource(R.drawable.fundo_txt_resultado_verde)
        }
        binding.btnMainInfos.setOnClickListener {
            val mIntent = Intent(this, InfosActivity::class.java)
            startActivity(mIntent)

        }
    }
}
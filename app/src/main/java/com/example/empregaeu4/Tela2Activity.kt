package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu4.databinding.ActivityTela2Binding

class Tela2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeUsuario = binding.tvUsuarioNome
        val nome = intent.getStringExtra("IntentNomeUsuario")
        nomeUsuario.text = nome

        val btParaTela3 = binding.button

        btParaTela3.setOnClickListener{
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity(intent)
        }
    }
}
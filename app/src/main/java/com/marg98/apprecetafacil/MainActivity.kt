package com.marg98.apprecetafacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marg98.apprecetafacil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetallesReceta.setOnClickListener(){
            val mIntent = Intent(this,ActivityDetallesReceta::class.java)
            startActivity(mIntent)
        }

        binding.btnEditarReceta.setOnClickListener(){
            val mIntent= Intent(this,ActivityEditarReceta::class.java)
            startActivity((mIntent))
        }
    }
}
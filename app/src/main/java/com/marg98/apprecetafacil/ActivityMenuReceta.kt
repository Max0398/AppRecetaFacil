package com.marg98.apprecetafacil

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marg98.apprecetafacil.databinding.ActivityDetallesRecetaBinding
import com.marg98.apprecetafacil.databinding.ActivityMainBinding
import com.marg98.apprecetafacil.databinding.ActivityMenuRecetaBinding

class ActivityMenuReceta : AppCompatActivity() {
    private lateinit var binding:ActivityMenuRecetaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMenuRecetaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEditarReceta.setOnClickListener(){
            var mIntent =Intent(this,ActivityEditarReceta::class.java)
            startActivity(mIntent)
        }
    }
}
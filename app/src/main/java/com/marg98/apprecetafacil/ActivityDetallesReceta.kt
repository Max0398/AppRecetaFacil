package com.marg98.apprecetafacil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marg98.apprecetafacil.databinding.ActivityDetallesRecetaBinding

class ActivityDetallesReceta : AppCompatActivity() {
    private lateinit var binding:ActivityDetallesRecetaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetallesRecetaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolverMain.setOnClickListener(){
            var mInten = Intent(this,MainActivity::class.java)
            startActivity(mInten)
        }

    }
}
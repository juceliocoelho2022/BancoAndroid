package com.devjucelio.bancoandroid

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity() {

    private lateinit var btn_fechar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda_tela)

        btn_fechar = findViewById(R.id.img_Fechar)

        btn_fechar.setOnClickListener {

            finish()
        }
    }
}
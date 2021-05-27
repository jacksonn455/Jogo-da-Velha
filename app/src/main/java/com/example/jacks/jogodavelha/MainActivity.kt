package com.example.jacks.jogodavelha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener { Toast.makeText(this, "Botao 1 selecionado", Toast.LENGTH_SHORT).show() }
        button2.setOnClickListener { Toast.makeText(this, "Botao 2 selecionado", Toast.LENGTH_SHORT).show() }
        button3.setOnClickListener { Toast.makeText(this, "Botao 3 selecionado", Toast.LENGTH_SHORT).show() }
        button4.setOnClickListener { Toast.makeText(this, "Botao 4 selecionado", Toast.LENGTH_SHORT).show() }
        button5.setOnClickListener { Toast.makeText(this, "Botao 5 selecionado", Toast.LENGTH_SHORT).show() }
        button6.setOnClickListener { Toast.makeText(this, "Botao 6 selecionado", Toast.LENGTH_SHORT).show() }
        button7.setOnClickListener { Toast.makeText(this, "Botao 7 selecionado", Toast.LENGTH_SHORT).show() }
        button8.setOnClickListener { Toast.makeText(this, "Botao 8 selecionado", Toast.LENGTH_SHORT).show() }
        button9.setOnClickListener { Toast.makeText(this, "Botao 9 selecionado", Toast.LENGTH_SHORT).show() }
    }
}

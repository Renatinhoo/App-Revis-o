package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primeiro = findViewById<EditText>(R.id.editTextTextPassword)
        val segundo = findViewById<EditText>(R.id.editTextTextPassword2)
        val botao = findViewById<Button>(R.id.roll_button)

        botao.setOnClickListener {
            /* Transforma o valor do EditText em inteiros */
            val primeiroInt = Integer.parseInt( primeiro.text.toString())
            val segundoInt = Integer.parseInt( segundo.text.toString())

            when {
                /* Toast: É aquela pequena janelinha que aparece no canto debaixo da aplicação */
                primeiroInt > segundoInt -> {
                    val toast = Toast.makeText(applicationContext, "Primeiro campo maior que o segundo!", Toast.LENGTH_SHORT)
                    toast.show()
                }

                primeiroInt < segundoInt -> {
                    val toast = Toast.makeText(applicationContext, "Primeiro campo menor que o segundo!", Toast.LENGTH_SHORT)
                    toast.show()
                }

                else -> {
                    val toast = Toast.makeText(applicationContext, "Os valores são iguais!", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}
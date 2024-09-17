package com.bma.healy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_formulario)

        val botaoPerfil: ImageView = findViewById(R.id.perfil)
        val botaoResultado: ImageView = findViewById(R.id.resultado)
        val botaoFormulario: ImageView = findViewById(R.id.formulario)
        val cadastrarFormulario: Button = findViewById(R.id.registrar)


        botaoPerfil.setOnClickListener {
            val intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }


        botaoResultado.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


        botaoFormulario.setOnClickListener {
            val intent = Intent(this, Formulario::class.java)
            Toast.makeText(this, "Formulário preenchido com sucesso!!!!!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


        cadastrarFormulario.setOnClickListener {

            Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show()
        }
    }
}

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


        var botaoPerfil: ImageView = findViewById(R.id.perfil)

        var botaoResultado: ImageView = findViewById(R.id.resultado)

        var botaoFormulario: ImageView = findViewById(R.id.formulario)

        var cadastrarFormulario: Button = findViewById(R.id.registrar)


        // adicionar evento do clique
        botaoPerfil.setOnClickListener {

            var intent = Intent(this, Perfil::class.java)

            startActivity(intent)
        }

        botaoResultado.setOnClickListener {

            var intent = Intent(this, Home::class.java)

            startActivity(intent)
        }


        botaoFormulario.setOnClickListener {

            var intent = Intent(this, Formulario::class.java)

            startActivity(intent)
        }

        botaoFormulario.setOnClickListener {

            Toast.makeText(this, "Formulário preenchido com sucesso!!!!!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}
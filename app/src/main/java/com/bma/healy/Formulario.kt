package com.bma.healy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
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



        // adicionar evento do clique
        botaoPerfil.setOnClickListener{

            var intent = Intent(this, Perfil::class.java)

            startActivity(intent)
        }

        botaoResultado.setOnClickListener{

            var intent = Intent(this, Home::class.java)

            startActivity(intent)
        }


        botaoFormulario.setOnClickListener{

            var intent = Intent(this, Formulario::class.java)

            startActivity(intent)
        }
    }
}
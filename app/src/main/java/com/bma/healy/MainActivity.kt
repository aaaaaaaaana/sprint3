package com.bma.healy

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        var btnLogin:Button = findViewById(R.id.botaoLogin)
//
//
//        // adicionar evento do clique
//        btnLogin.setOnClickListener{
//
//            var intent = Intent(this, Login::class.java)
//
//            startActivity(intent)
//
//        }
//
//
//        var btnCadastro:Button = findViewById(R.id.botaoCadastro)
//
//
//        // adicionar evento do clique
//        btnCadastro.setOnClickListener{
//
//            var intent = Intent(this, Cadastro::class.java)
//
//            startActivity(intent)
//
//
//
//        }

        var linkLogin: TextView = findViewById(R.id.linkLogin)

        var botaoLogin: TextView = findViewById(R.id.botaoLogin)


        // adicionar evento do clique
        linkLogin.setOnClickListener{

            var intent = Intent(this, Cadastro::class.java)

            startActivity(intent)
        }

        botaoLogin.setOnClickListener{

            var intent = Intent(this, Home::class.java)

            startActivity(intent)
        }


    }
}
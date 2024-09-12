package com.bma.healy

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        var linkLogin: TextView = findViewById(R.id.linkLogin)

        var botaoLogin: TextView = findViewById(R.id.botaoLogin)


        // adicionar evento do clique
        linkLogin.setOnClickListener{

            var intent = Intent(this, Cadastro::class.java)

            startActivity(intent)
        }

        botaoLogin.setOnClickListener{

            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
package com.bma.healy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

//        var linkLogin: TextView = findViewById(R.id.linkLogin)
//
//        var botaoLogin: TextView = findViewById(R.id.botaoLogin)
//
//
//        // adicionar evento do clique
//        linkLogin.setOnClickListener{
//
//            var intent = Intent(this, Cadastro::class.java)
//
//            startActivity(intent)
//        }
//
//        botaoLogin.setOnClickListener{
//
//            var intent = Intent(this, MainActivity::class.java)
//
//            startActivity(intent)
//        }
    }
}
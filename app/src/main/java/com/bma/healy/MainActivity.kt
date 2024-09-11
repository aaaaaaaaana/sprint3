package com.bma.healy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnLogin:Button = findViewById(R.id.botaoLogin)


        // adicionar evento do clique
        btnLogin.setOnClickListener{

            var intent = Intent(this, Login::class.java)

            startActivity(intent)


        }
    }
}
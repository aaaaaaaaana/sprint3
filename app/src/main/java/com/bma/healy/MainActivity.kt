package com.bma.healy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bma.healy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.botaoLogin.setOnClickListener(View.OnClickListener {
            if(binding.user.text.toString() == "user" && binding.senha.text.toString() == "1234"){

            }
        })


        var linkLogin: TextView = findViewById(R.id.linkLogin)

        var botaoLogin: TextView = findViewById(R.id.botaoLogin)


        // adicionar evento do clique
        linkLogin.setOnClickListener {

            var intent = Intent(this, Cadastro::class.java)

            startActivity(intent)
        }

        botaoLogin.setOnClickListener {

            var intent = Intent(this, Perfil::class.java)

            startActivity(intent)
        }


    }
}
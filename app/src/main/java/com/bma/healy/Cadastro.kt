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

class Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button
    lateinit var registerButton: Button

    // Lista para armazenar os usuários cadastrados (em um cenário real, usaria um banco de dados)
    private val registeredUsers = mutableListOf<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializar as views
        username = binding.user
        password = binding.senha
        loginButton = binding.botaoLogin
        registerButton = binding.botaoLogin

        // Botão de login
        loginButton.setOnClickListener {
            val enteredUsername = username.text.toString()
            val enteredPassword = password.text.toString()

            val user = registeredUsers.find { it.username == enteredUsername && it.password == enteredPassword }
            if (user != null) {
                Toast.makeText(this, "Logado com Sucesso", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Falha no Login", Toast.LENGTH_SHORT).show()
            }
        }

        // Botão de cadastro
        registerButton.setOnClickListener {
            val newUsername = username.text.toString()
            val newPassword = password.text.toString()

            // Verificar se o usuário já existe
            if (registeredUsers.any { it.username == newUsername }) {
                Toast.makeText(this, "Usuário já existe", Toast.LENGTH_SHORT).show()
            } else {
                // Criar o novo usuário
                val newUser = User(newUsername, newPassword)
                registeredUsers.add(newUser)

                Toast.makeText(this, "Usuário cadastrado com sucesso", Toast.LENGTH_SHORT).show()

                // Limpar os campos de entrada
                username.setText("")
                password.setText("")
            }
        }
    }
}

// Classe para representar um usuário
data class User(val username: String, val password: String)
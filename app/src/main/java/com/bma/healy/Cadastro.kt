package com.bma.healy


import android.content.Intent
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.bma.healy.databinding.ActivityCadastroBinding
import com.google.firebase.auth.FirebaseAuth


class Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.linkCadastro.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.botaoCadastro.setOnClickListener{
            val email = binding.email.text.toString()
            val user = binding.user.text.toString()
            val nome = binding.nome.text.toString()
            val cpf = binding.cpf.text.toString()
            val senha = binding.senha.text.toString()
            val confirmaSenha = binding.confirmaSenha.text.toString()

            if (email.isNotEmpty() && user.isNotEmpty() && nome.isNotEmpty() && cpf.isNotEmpty() && senha.isNotEmpty() && confirmaSenha.isNotEmpty()) {
                 if (senha == confirmaSenha) {

                    firebaseAuth.createUserWithEmailAndPassword(user, senha).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)

                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }
                 }else {
                     Toast.makeText(this, "Senhas não batem", Toast.LENGTH_SHORT).show()
                 }
            }else{
                Toast.makeText(this, "Campo vazio, preencha!!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
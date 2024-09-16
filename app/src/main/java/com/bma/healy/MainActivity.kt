package com.bma.healy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bma.healy.databinding.ActivityMainBinding
import java.security.MessageDigest
import android.util.Base64
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.linkLogin.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }

        binding.botaoLogin.setOnClickListener{
            val user = binding.user.text.toString()
            val senha = binding.senha.text.toString()

            if (user.isNotEmpty() && senha.isNotEmpty()) {


                    firebaseAuth.signInWithEmailAndPassword(user, senha).addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent(this, Home::class.java)
                            startActivity(intent)

                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }
            }else{
                Toast.makeText(this, "Campo vazio, preencha!!", Toast.LENGTH_SHORT).show()
            }


        }


    }

}

package com.bma.healy

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.Intent
import android.media.RouteListingPreference.Item
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bma.healy.databinding.ActivityMainBinding

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_nav, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.formulario -> {
                val intent = Intent(this, Formulario::class.java)
                startActivity(intent)
                return true
            }
            R.id.resultado -> {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
                return true
            }
            R.id.perfil -> {
                val intent = Intent(this, Perfil::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
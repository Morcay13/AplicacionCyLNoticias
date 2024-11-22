package com.example.aplicacioncylnoticias

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonListaNoticias = findViewById<ImageButton>(R.id.boton_lista_noticias)

        // Acción al pulsar el botón
        botonListaNoticias.setOnClickListener {
            val intent = Intent(this, ListaNoticiasActivity::class.java)
            startActivity(intent)
        }
    }
}




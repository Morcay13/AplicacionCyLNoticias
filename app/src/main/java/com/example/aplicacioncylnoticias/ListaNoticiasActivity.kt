package com.example.aplicacioncylnoticias

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListaNoticiasActivity : AppCompatActivity() {

    lateinit var spinnerCategorias: Spinner

    private val categorias = arrayOf("Política", "Economia", "Cultura", "Deportes")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar las vistas
        initViews()

        //Al adaptador le he pasado como parametro esta actividad y el array de las categorias
        //guardado en String
        ArrayAdapter.createFromResource(
            this,
            R.array.noticias_array,
            android.R.layout.simple_spinner_item
        ).also {adapter ->
            //se indica el layaout para visualizar en dropView
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            //se aplica el spinner al adaptador
            spinnerCategorias.adapter = adapter
        }
        //fijacion del listener
        spinnerCategorias.onItemSelectedListener = this

        // Noticias que estraran estáticas
        val noticias = listOf(
            "Noticia de Política 1",
            "Noticia de Economía 2",
            "Noticia de Cultura 3",
            "Noticia de Deportes 4"
        )
        val adaptadorLista = ArrayAdapter(this, android.R.layout.simple_list_item_1, noticias)
        lista_noticias.adapter = adaptadorLista
    }

    private fun initViews() {
        spinnerCategorias = findViewById(R.id.spinnerCategorias)
}




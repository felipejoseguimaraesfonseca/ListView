package com.felipejose.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lista = findViewById<ListView>(R.id.lista) as ListView

        val programacao = arrayOf("Kotlin", "Java", "JavaScript", "C++", "C#(sharp)", "Swift", "Angular", "Flutter", "Pyhton", "CSS", "PHP")

        val adp: ArrayAdapter<String> = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,programacao)

        lista.adapter = adp

        lista.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this@MainActivity,"Item Clicado:-$id",Toast.LENGTH_SHORT).show()
        }
    }
}

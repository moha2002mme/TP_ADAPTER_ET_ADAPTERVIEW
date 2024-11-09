package com.example.adapter_et_adapterview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Exercice5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_exercice5)

        val lv = findViewById<ListView>(R.id.lv)
        val FAB = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        Toast.makeText(this, "Exercice 5", Toast.LENGTH_SHORT).show()


        val listePersonnes = arrayListOf(
            hashMapOf("nom" to "ALAMI", "prenom" to "Mohammed", "age" to "38"),
            hashMapOf("nom" to "ALAOUI", "prenom" to "Taha", "age" to "65"),
            hashMapOf("nom" to "IQBAL", "prenom" to "Imane", "age" to "15"),
            hashMapOf("nom" to "ALAMI", "prenom" to "Nada", "age" to "24"),
            hashMapOf("nom" to "SELLAM", "prenom" to "Issam", "age" to "12")
        )

        val adapter = customAdabter_exercice5(this, listePersonnes)
        lv.adapter = adapter


        FAB.setOnClickListener {
            val intent = Intent(this@Exercice5, Exercice1::class.java)
            startActivity(intent)
        }
    }
}
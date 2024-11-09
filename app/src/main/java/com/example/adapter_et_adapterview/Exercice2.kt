package com.example.adapter_et_adapterview


import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Exercice2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercice2)
        val lv = findViewById<ListView>(R.id.lv)
        val FAB = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        Toast.makeText(this, "Exercice 2", Toast.LENGTH_SHORT).show()


        val langueProgrammation = hashMapOf(
            R.drawable.java to Pair("java", 1995),
            R.drawable.javascript to Pair("javascript", 1995),
            R.drawable.kotlin to Pair("kotlin ", 2011),
            R.drawable.php to Pair("php", 1995),
            R.drawable.python to Pair("python", 1991),
            R.drawable.swift to Pair("swift", 2014),
        )


//        val test:Map<Int,Pair<String,Int>> = langueProgrammation


        val langueProgrammationMap = langueProgrammation.map { e ->
            mapOf(
                "icon" to e.key,
                "nom" to e.value.first,
                "annee" to e.value.second
            )
        }
        val adapter = SimpleAdapter(
            this,
            langueProgrammationMap,
            R.layout.customlayout_exercice2,
            arrayOf("icon", "nom", "annee"),
            intArrayOf(R.id.icon, R.id.nom, R.id.anneeApparation)
        )
        lv.adapter = adapter


        FAB.setOnClickListener {
            val intent = Intent(this@Exercice2, Exercice3::class.java)
            startActivity(intent)
        }
    }
}
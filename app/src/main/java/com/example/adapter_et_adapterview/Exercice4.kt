package com.example.adapter_et_adapterview


import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Exercice4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_exercice4)

        val lv = findViewById<ListView>(R.id.lv)
        val FAB = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        Toast.makeText(this, "Exercice 4", Toast.LENGTH_SHORT).show()


        val paysInfos = listOf(
            mapOf("Pays" to "Palestine", "Capitale" to "Al-Qods", "Continent" to "Asie"),
            mapOf("Pays" to "Albanie", "Capitale" to "Tirana", "Continent" to "Europe"),
            mapOf("Pays" to "Algérie", "Capitale" to "Alger", "Continent" to "Afrique"),
            mapOf("Pays" to "Afghanistan", "Capitale" to "Kaboul", "Continent" to "Asie"),
            mapOf("Pays" to "Andorre", "Capitale" to "Andorre-la-Vieille", "Continent" to "Europe"),
            mapOf("Pays" to "Angola", "Capitale" to "Luanda", "Continent" to "Afrique"),
            mapOf("Pays" to "Argentine", "Capitale" to "Buenos Aires", "Continent" to "Amérique")
        )
        val adp = SimpleAdapter(
            this,
            paysInfos,
            R.layout.customlayout_exercice4,
            arrayOf("Pays", "Capitale", "Continent"),
            intArrayOf(R.id.pays, R.id.capital, R.id.continent)
        )
        lv.adapter = adp


        FAB.setOnClickListener {
            val intent = Intent(this@Exercice4, Exercice5::class.java)
            startActivity(intent)
        }
    }
}
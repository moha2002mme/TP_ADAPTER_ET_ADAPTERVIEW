package com.example.adapter_et_adapterview

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.service.controls.actions.FloatAction
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Exercice1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_exercice1)
        val lv = findViewById<ListView>(R.id.lv)
        val FAB = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        Toast.makeText(this, "Exercice 1", Toast.LENGTH_SHORT).show()

        val languageProgrammation = listOf("java", "C#", "kotlin", "php", "python", "swift")

        /*-----------------------------affichage1-----------------------------*/

//        val adp1=ArrayAdapter(this,android.R.layout.simple_list_item_1,languageProgrammation)
//        lv.adapter=adp1


        /*-----------------------------CHOICE_MODE_SINGLE-----------------------------*/

//        val adp2=ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,languageProgrammation)
//        lv.adapter=adp2
//        lv.choiceMode=ListView.CHOICE_MODE_SINGLE


        /*-----------------------------CHOICE_MODE_MULTIPLE-----------------------------*/

        val adp3 = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_multiple_choice,
            languageProgrammation
        )
        lv.adapter = adp3
        lv.choiceMode = ListView.CHOICE_MODE_MULTIPLE


        FAB.setOnClickListener {
            val intent = Intent(this@Exercice1, Exercice2::class.java)
            startActivity(intent)
        }
    }
}
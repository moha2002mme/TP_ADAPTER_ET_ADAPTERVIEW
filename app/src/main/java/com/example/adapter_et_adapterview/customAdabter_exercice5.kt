package com.example.adapter_et_adapterview


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.util.HashMap

class customAdabter_exercice5(val c: Context, val liste: ArrayList<HashMap<String, String>>) :
    BaseAdapter() {
    private val inflater: LayoutInflater = LayoutInflater.from(c)

    override fun getCount(): Int {
        return liste.size
    }

    override fun getItem(position: Int): Any {
        return liste[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val v = inflater.inflate(R.layout.customlayout_exercice5, parent, false)

        val nom = v.findViewById<TextView>(R.id.nom)
        val prenom = v.findViewById<TextView>(R.id.prenom)
        val age = v.findViewById<TextView>(R.id.age)

        val prs = liste[position]

        nom.text = prs["nom"]
        prenom.text = prs["prenom"]
        age.text = prs["age"]

        if (prs["age"]!!.toInt() < 18) {
            age.setTextColor(ContextCompat.getColor(c, R.color.verte))
        }else{
            age.setTextColor(ContextCompat.getColor(c, R.color.bleu))
        }

        return v
    }
}
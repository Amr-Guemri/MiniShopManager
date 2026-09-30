package com.example.minishopmanager

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CatalogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        val listViewProducts = findViewById<ListView>(R.id.listViewProducts)

        // Chargement du tableau de produits depuis strings.xml
        val products = resources.getStringArray(R.array.products)

        // Création de l'adaptateur
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            products
        )
        listViewProducts.adapter = adapter

        // Gestion du clic sur un produit
        listViewProducts.setOnItemClickListener { parent, _, position, _ ->
            val selectedProduct = parent.getItemAtPosition(position).toString()
            Toast.makeText(this, "Produit sélectionné : $selectedProduct", Toast.LENGTH_SHORT).show()
        }
    }
}
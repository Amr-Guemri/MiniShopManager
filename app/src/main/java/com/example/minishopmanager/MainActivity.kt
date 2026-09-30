package com.example.minishopmanager

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "LIFECYCLE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate appelé")

        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnCatalog = findViewById<Button>(R.id.btnCatalog)

        btnNext.setOnClickListener {
            Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Clic sur le bouton Voir le Catalogue -> Navigation vers CatalogActivity
        btnCatalog.setOnClickListener {
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart appelé")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume appelé")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause appelé")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop appelé")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy appelé")
    }
}
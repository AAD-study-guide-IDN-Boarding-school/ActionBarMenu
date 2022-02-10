package com.example.optionmenuinactionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu1 -> {
                Toast.makeText(this, "Tombol Share Di Klik", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu2 -> {
                Toast.makeText(this, "Tombol Menu 2 di klik", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu3 -> {
                val i = Intent(this, SecondActivity::class.java)
                startActivity(i)
                true
            }
            else -> true
        }
    }
}
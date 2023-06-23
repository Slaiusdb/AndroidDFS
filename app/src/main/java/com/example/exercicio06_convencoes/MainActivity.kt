package com.example.exercicio06_convencoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.exercicio06_convencoes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActivity1.setOnClickListener {
            Toast.makeText(applicationContext, "Clicked Button", Toast.LENGTH_SHORT)
                .show()
        }
        binding.btnActivity2.setOnClickListener {
            startActivity(Intent(this,Activitybutton::class.java))
        }
    }
}
package com.example.exercicio06_convencoes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicio06_convencoes.databinding.ActivityActivitybuttonBinding

class Activitybutton : AppCompatActivity() {
    private lateinit var binding: ActivityActivitybuttonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitybutton)

        binding = ActivityActivitybuttonBinding.inflate(layoutInflater)

        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}
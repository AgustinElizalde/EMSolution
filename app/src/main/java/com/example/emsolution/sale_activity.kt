package com.example.emsolution

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emsolution.databinding.ActivitySaleBinding

class sale_activity : AppCompatActivity() {

    private lateinit var binding: ActivitySaleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saleBtnBack.setOnClickListener{
            startActivity(Intent(this, employee_activity::class.java))
        }
    }
}
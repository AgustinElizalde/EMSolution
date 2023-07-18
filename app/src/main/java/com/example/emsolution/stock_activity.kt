package com.example.emsolution

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emsolution.databinding.ActivityStockBinding

class stock_activity : AppCompatActivity() {

    private lateinit var binding: ActivityStockBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStockBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.stockBtnBack.setOnClickListener{
            startActivity(Intent(this, employee_activity::class.java))
        }
    }
}
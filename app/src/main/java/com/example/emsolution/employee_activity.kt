package com.example.emsolution

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emsolution.databinding.ActivityEmployeeBinding

class employee_activity : AppCompatActivity() {

    private lateinit var binding: ActivityEmployeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.employeeBtnBack.setOnClickListener{
            startActivity(Intent(this, login_activity::class.java))
        }

        binding.employeeBtnSale.setOnClickListener{
            startActivity(Intent(this, sale_activity::class.java))
        }

        binding.employeeBtnStock.setOnClickListener{
            startActivity(Intent(this, stock_activity::class.java))
        }
    }
}
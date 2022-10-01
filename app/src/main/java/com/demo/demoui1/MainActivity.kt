package com.demo.demoui1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.size
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.demoui1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.semiProg1.setPercent(25)
        binding.semiProg2.setPercent(50)

        binding.rvMain.layoutManager = LinearLayoutManager(this)
        binding.rvMain.adapter = MainAdapter()
    }
}
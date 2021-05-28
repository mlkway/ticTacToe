package com.raywenderlich.tbc_shemajamebeli_four

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raywenderlich.tbc_shemajamebeli_four.databinding.ActivityMainBinding
import com.raywenderlich.tbc_shemajamebeli_four.databinding.ItemTicTacToeBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
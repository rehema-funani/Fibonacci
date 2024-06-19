package com.akirachix.fibonacci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.akirachix.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val num = fibonac(100)
        binding.rvNumbers.layoutManager = GridLayoutManager(this,2)
        val adapterNums = Numbers(num)
        binding.rvNumbers.adapter = adapterNums




    }
    fun fibonac(s:Int):List<Int>{
        val num = mutableListOf(0,1)
        while(num.size<s){
            num.add(num[num.lastIndex]+num[num.lastIndex-1])
        }
        return num

    }

}
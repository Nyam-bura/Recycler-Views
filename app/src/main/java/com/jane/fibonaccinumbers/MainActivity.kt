package com.jane.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jane.fibonaccinumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()
    }
    fun displayNumbers(){
        var Numbers_list=Nums(100)
        val Numbers_adapter=NumberRecyclerViewAdapter(Numbers_list)

        binding.rvnumbers.layoutManager=LinearLayoutManager(this)
        binding.rvnumbers.adapter=Numbers_adapter
    }
    fun Nums(args:Int):List<Int>{
        val list = ArrayList<Int>()
        var number1=0
        var number2=1
        for (i in 1..args){
            var sum = number1 + number2
            number1=number2
            number2=sum
            list +=sum
        }
        return list

    }

}
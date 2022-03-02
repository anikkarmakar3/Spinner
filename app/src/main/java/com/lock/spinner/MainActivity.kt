package com.lock.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.lock.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var binding: ActivityMainBinding
    var listofcity= arrayOf("kolkata", "delhi", "malda","gazole", "maddhamgram")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.spincity.onItemSelectedListener = this
        val adpter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,listofcity)
        adpter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spincity.adapter=adpter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        binding.showtext.text="the selected city is "+listofcity[position]
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}
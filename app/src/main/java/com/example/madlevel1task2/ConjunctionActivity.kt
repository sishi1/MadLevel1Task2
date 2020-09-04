package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityConjunctionBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConjunctionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConjunctionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener() { checkAnswer() }
    }

    private fun checkAnswer() {
        val answer1 = binding.etAnswer1.text.toString()
        val answer2 = binding.etAnswer2.text.toString()
        val answer3 = binding.etAnswer3.text.toString()
        val answer4 = binding.etAnswer4.text.toString()

        if ( (answer1 == "T") && (answer2 == "F") && (answer3 == "F") && (answer4 == "F"))
            Toast.makeText(this, getString(R.string.Correct),
            Toast.LENGTH_LONG).show()
        else Toast.makeText(this, getString(R.string.Incorrect),
            Toast.LENGTH_LONG).show()
    }
}
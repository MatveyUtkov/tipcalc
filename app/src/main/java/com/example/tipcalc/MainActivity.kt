package com.example.tipcalc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { calculate()}
    }
private fun calculate(){
    val amount:EditText=findViewById(R.id.editTextNumber)
    val tip : EditText =findViewById(R.id.editTextNumber2)
    val number: Double = amount.getText().toString().toDouble()
    val numberq: Double = tip.getText().toString().toDouble()
    val tippercet=numberq/100
    val tiptotal=tippercet+1
    val totalAmount= number*tiptotal
    println(totalAmount)
    println(tiptotal)
    val resultTextView: TextView = findViewById(R.id.textView2)
    resultTextView.text = totalAmount.toString().toDouble().toString()
}
}
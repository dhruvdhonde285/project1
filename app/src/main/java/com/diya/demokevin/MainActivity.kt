package com.diya.demokevin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    // declaration of the variables
    lateinit var add: MaterialButton
    lateinit var sub: MaterialButton
    lateinit var mult: MaterialButton
    lateinit var division: MaterialButton
    lateinit var first_number: TextInputEditText
    lateinit var sec_number: TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialization of the variables
        add=findViewById(R.id.add_btn)
        sub=findViewById(R.id.sub_btn)
        division=findViewById(R.id.div_btn)
        mult=findViewById(R.id.mult_btn)
        first_number=findViewById(R.id.first_number)
        sec_number=findViewById(R.id.second_number)


        add.setOnClickListener {

            val n1:Int=first_number.text.toString().toInt()
            val n2:Int=sec_number.text.toString().toInt()

            val res=n1+n2

            Toast.makeText(this@MainActivity,res.toString(),Toast.LENGTH_LONG).show()
        }



    }
}
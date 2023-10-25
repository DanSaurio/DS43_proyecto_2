package com.narnia.dt.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.narnia.dt.dados.models.Dice
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var dice : Dice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var value : String = ""
        lateinit var  Res : TextView
        var result : Int = 0
        val caras = findViewById<EditText>(R.id.editTxtNoCara)
        val dados = findViewById<EditText>(R.id.editTxtNoDado)
        val btnLanzar = findViewById<Button>(R.id.buttonLanzar)
        Res = findViewById<TextView>(R.id.textResult)

        btnLanzar.setOnClickListener{
            Toast.makeText(this, "~Numero de caras~ " + caras.text   , Toast.LENGTH_SHORT).show()

            fun Random(): Int{
                return (0..dice.cantidadCaras).random();
            }
        }


    }
}
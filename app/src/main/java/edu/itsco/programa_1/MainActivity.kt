package edu.itsco.programa_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewDebug
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


    lateinit var txt1: EditText
    lateinit var txt2: EditText
    lateinit var txtresul: TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vtcal:Button = findViewById(R.id.vtcal)

        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)

        txtresul = findViewById(R.id.txtresul)

        vtcal.setOnClickListener { view ->
            Toast.makeText(this.applicationContext, "Calculando...", Toast.LENGTH_SHORT).show()
            mayor()
        }
    }

    fun mayor() {
        val valor1 = txt1.text.toString().toInt()
        val valor2 = txt2.text.toString().toInt()

        if(valor1 > valor2)
        {
            txtresul.text="El mayor es: $valor1"
        }
        else if(valor2 > valor1)
        {
            txtresul.text="El mayor es: $valor2"
        }
        else if(valor1 == valor2)
        {
            txtresul.text="Los Valores son Iguales"
        }


    }

}









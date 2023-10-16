package com.patri.aplicacionespmdmt2.HelloApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.patri.aplicacionespmdmt2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Esto son objetos
        var btnSend = findViewById<Button>(R.id.buttonSend)//boton
        var userText = findViewById<EditText>(R.id.etName)//edit text

        btnSend.setOnClickListener {
            //Log.i("Ruben", "Sending")
            var name = userText.text.toString()
            //Aqui es donde almacenamos el nombre
            //atributo llamado text lo convierto en string y lo almaceno
            if (name.isNotEmpty()){
                var textIntent = Intent(this, SecondActivity::class.java)
                //Un intent necesita dos parámetros
                //this contexto donde actua
                //a donde se dirige, donde va actuar.... SecondAccitvity es la clase
                textIntent.putExtra("extra_name",name)
                startActivity(textIntent)
            }


        }
    }
}
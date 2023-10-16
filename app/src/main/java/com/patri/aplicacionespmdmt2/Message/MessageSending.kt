package com.patri.aplicacionespmdmt2.Message

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.patri.aplicacionespmdmt2.HelloApp.SecondActivity
import com.patri.aplicacionespmdmt2.R

class MessageSending : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_sending)

        //Esto son objetos
        var btnSend = findViewById<Button>(R.id.buttonSend)//boton
        var userText = findViewById<EditText>(R.id.etMsg)//edit text

        btnSend.setOnClickListener {
            //Log.i("Ruben", "Sending")
            var message = userText.text.toString()
            //Aqui es donde almacenamos el nombre
            //atributo llamado text lo convierto en string y lo almaceno

            if (message.isNotEmpty()){
                var intent = Intent(this, SecondActivity::class.java)
                //Un intent necesita dos parámetros
                //this contexto donde actua
                //a donde se dirige, donde va actuar.... SecondAccitvity es la clase
                intent.putExtra("extra_name",message)
                startActivity(intent)
            }


        }

        var textReceived= findViewById<TextView>(R.id.tvReply)

    }
}
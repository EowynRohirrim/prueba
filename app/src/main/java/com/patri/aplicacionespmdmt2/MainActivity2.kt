package com.patri.aplicacionespmdmt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.patri.aplicacionespmdmt2.BoardgamesApp.BoardGameActivity
import com.patri.aplicacionespmdmt2.HelloApp.MainActivity
import com.patri.aplicacionespmdmt2.IMCApp.IMCcalculator
import com.patri.aplicacionespmdmt2.Message.MessageSending

class MainActivity2 : AppCompatActivity() {


    //Aqui vamos a tener poco código Haremos todo funciones externas
    //para cuando haya errores todo se localice fácil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btnHelloApp = findViewById<Button>(R.id.btnHello)
        btnHelloApp.setOnClickListener{ navigateToHelloApp() }

        var btnMessageApp = findViewById<Button>(R.id.btnMessage)
        btnHelloApp.setOnClickListener{ navigateToMessageApp() }

        var btnIMCApp = findViewById<Button>(R.id.btnIMC)
        btnIMCApp.setOnClickListener{ navigateToIMCApp() }

        var btnBoardgameApp = findViewById<Button>(R.id.btnBoardgame)
        btnBoardgameApp.setOnClickListener{ navigateToBoardgameApp() }
    }

    //Fuera de la función onCreate()
    private fun navigateToHelloApp(){
        var intent = Intent (this,MainActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToMessageApp(){
        var intent = Intent (this,MessageSending::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCApp(){
        var intent = Intent (this,IMCcalculator::class.java)
        startActivity(intent)
    }

    private fun navigateToBoardgameApp(){
        var intent = Intent (this,BoardGameActivity::class.java)
        startActivity(intent)
    }
}

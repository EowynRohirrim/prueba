package com.patri.aplicacionespmdmt2.Message

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.patri.aplicacionespmdmt2.R
import com.patri.aplicacionespmdmt2.databinding.ActivityReplySendingBinding

class ReplySending : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityReplySendingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reply_sending)

        var btnSend = findViewById<Button>(R.id.btnSend)
        var userText = findViewById<EditText>(R.id.etMsg)

        btnSend.setOnClickListener(){
            var reply = userText.text.toString()
            if (reply.isNotEmpty()){
                var intent = Intent(this, MessageSending::class.java)
                intent.putExtra("extra_reply",reply)
                startActivity(intent)
            }

        }
        var textReceived:


    }


}
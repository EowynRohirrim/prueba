package com.patri.aplicacionespmdmt2.IMCApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.slider.RangeSlider
import com.patri.aplicacionespmdmt2.R
import java.lang.Math.pow
import java.text.DecimalFormat

class IMCcalculator : AppCompatActivity() {

    //Para que por defecto este hombre seleccionado
    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false

    //declaramos las variables arriba
    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView

    //El range slider
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider

    //El peso
    private lateinit var tvWeight: TextView
    private lateinit var btnSubstractWeight: CardView
    private lateinit var btnAddWeight: CardView
    private var currentWeight: Int = 70

    //La edad
    private lateinit var tvAge: TextView
    private lateinit var btnSubstractAge: CardView
    private lateinit var btnAddAge: CardView
    private var currentAge: Int = 30

    //CAlcular
    private lateinit var btnCalcular: CardView
    private var currentHeight: Int = 120




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccalculator)

        initComponents()//Tiene que ir primero
        initlisteners()
        setWeight()
        setAge()
    }

    private fun initComponents() {
        viewMale = findViewById<CardView>(R.id.viewMale) //CardView es redundante pero por si no funciona...
        viewFemale = findViewById<CardView>(R.id.viewFemale)

        //El range slider
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)

        //El peso
        tvWeight = findViewById(R.id.tvWeight)
        btnSubstractWeight = findViewById(R.id.btnSubstractWeight)
        btnAddWeight = findViewById(R.id.btnAddWeight)

        //La edad
        tvAge = findViewById(R.id.tvAge)
        btnSubstractAge = findViewById(R.id.btnSubstractAge)
        btnAddAge = findViewById(R.id.btnAddAge)

        //Boton Calcular
        btnCalculate = findViewById(R.id.btnCalculate)
    }

    private fun initlisteners() {
        viewMale.setOnClickListener{ setColorComponentMale()}
        viewFemale.setOnClickListener{ setColorComponentFemale()}

        //El range slider
        //Crea tres atributos rangeslider, float y boolean
        //Si se le pone una _ barra baja no los usa
        rsHeight.addOnChangeListener { _, value, _ ->
            //tvHeight.text = value.toString()
            val df = DecimalFormat("#")
            //val result = df.format(value)
            //tvHeight.text = "$result cm"
            val current = df.format(value)
            tvHeight.text = "$currentHeight cm"
        }

        btnSubstractWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }
        btnAddWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }
        btnSubstractAge.setOnClickListener {
            currentAge -= 1
            setAge()
        }
        btnAddAge.setOnClickListener {
            currentAge += 1
            setAge()
        }
        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)//le pasamos un double

            //Para comprobar en la consola que el calculo lo hace bien, usamos:
            //Log.i("IMC", "El IMC es $result")
        }
    }

    private fun setColorComponentMale() {
        if (!isMaleSelected){ //Si no está seleccionado hombre
            viewMale.setCardBackgroundColor(getColor(R.color.background_component_selected))
            viewFemale.setCardBackgroundColor(getColor(R.color.background_component))
            isMaleSelected = true
            isFemaleSelected = false
        }
    }

    private fun setColorComponentFemale() {
        if (!isFemaleSelected){ //Si no está seleccionado mujer
            viewMale.setCardBackgroundColor(getColor(R.color.background_component))
            viewFemale.setCardBackgroundColor(getColor(R.color.background_component_selected))
            isMaleSelected = false
            isFemaleSelected = true
        }
    }

    private fun setWeight() { tvWeight.text = currentWeight.toString() }
    private fun setAge() { tvAge.text = currentAge.toString() }

    private fun calculateIMC():Double {
        val df = DecimalFormat("#.##")
        val imc = currentWeight / pow(currentHeight.toDouble() /100, 2.0)

        return df.format(imc).toDouble()
    }
    // Log.i("IMC", "El IMC es $result") en el método
    // setOnClickListener para mostrarlo por consola

    private fun navigateToResult(result: Double){
        val intent = Intent(this, ResultActivity::cass.java)
        intent.putExtra("extra_IMC", result)
        startActivity(intent)
    }
}
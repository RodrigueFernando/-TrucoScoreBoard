package br.edu.ifsp.scl.sc3018237.trucoscoreboard

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var  pontoA = 0
    private var pontoB = 0

    private lateinit var botaoMais3A : Button
    private lateinit var botaoMais3B : Button
    private  lateinit var botaoMais1A : Button
    private lateinit var  botaoMais1B : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val placarEquipeA = findViewById<TextView>(R.id.placarA)
         botaoMais1A= findViewById<Button>(R.id.add1A)



        val placarEquipeB = findViewById<TextView>(R.id.placarB)
        botaoMais1B = findViewById<Button>(R.id.add1B)

        botaoMais3A = findViewById<Button>(R.id.add3A)
        botaoMais3B = findViewById<Button>(R.id.add3B)

        val botaoResetaPlacar = findViewById<Button>(R.id.resetar)

        botaoMais1A.setOnClickListener {
            pontoA++
            placarEquipeA.text = "$pontoA"
            jogarTruco()
        }

        botaoMais3A.setOnClickListener {
            pontoA +=3
            placarEquipeA.text = "$pontoA"
            jogarTruco()
        }

        botaoMais1B.setOnClickListener {
            pontoB++
            placarEquipeB.text = "$pontoB"
            jogarTruco()
        }

        botaoMais3B.setOnClickListener {
            pontoB +=3
            placarEquipeB.text =  pontoB.toString()
            jogarTruco()
        }

        botaoResetaPlacar.setOnClickListener {
            pontoA = 0;
            pontoB = 0

            placarEquipeA.text = pontoA.toString()
            placarEquipeB.text = pontoB.toString()
        }





    }
    private fun jogarTruco(){

        if(pontoA  >= 11){
            botaoMais3A.isEnabled = false
            Toast.makeText(this, "Equipe A esta na mão de 11!", Toast.LENGTH_SHORT).show()

        }

       if(pontoB >= 11){
           Toast.makeText(this,"Equipe B esta na mão de 11!", Toast.LENGTH_SHORT).show()
           botaoMais3B.isEnabled = false
       }



    }
}
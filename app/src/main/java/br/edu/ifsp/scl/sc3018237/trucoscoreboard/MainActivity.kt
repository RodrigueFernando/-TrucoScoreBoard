package br.edu.ifsp.scl.sc3018237.trucoscoreboard

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var pontoA = 0
    private var pontoB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val placarEquipeA = findViewById<TextView>(R.id.placarA)
        val botaoMais1A= findViewById<Button>(R.id.add1A)

        val placarEquipeB = findViewById<TextView>(R.id.placarB)
        val botaoMais1B = findViewById<Button>(R.id.add1B)

        botaoMais1A.setOnClickListener {
            pontoA++
            placarEquipeA.text = "$pontoA"
        }

        botaoMais1B.setOnClickListener {
            pontoB++
            placarEquipeB.text = "$pontoB"
        }



    }
}
package com.example.mysecondsecondepicapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math.round
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        //Conversiones

        var centigrado : Int = -1
        var kelvin = round(273.15 + (1 * centigrado)) // incremento de 1 en 1
        var fahren = (32 + (1.800 * centigrado)).roundToInt() //incremento de 1.800
        var reaumur = (0 + (0.800 * centigrado)).roundToInt() // incremento de 0.800

        println("Kelvin '$kelvin' Fahren '$fahren'  Reaumur '$reaumur'")

        //Caracoles

        var p = 8
        var s = 5
        var r = 2

        var sTotal = p / (s - r)

        println("Dias '$sTotal'")

        //Pitagoras
       /* val mybutonsin = findViewById<Button>(R.id.my_butonsin)
        mybutonsin.setOnClickListener(){
            val text = "I'M FUCKING EPIC!!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        var a : Int = 5
        var b : Int = 3
        var n : Int = 11
        var m : Int = 0
        var t : Int = 0
        var i : Int = 1
        //var temp : Int

        while(i <= n){
            if(i % a == 0 || i % b == 0){
                t++
                m = i
            }
            i++
        }
        println("T : ${t} M : ${m}")*/


        /*var a : Int = 3
        var b : Int = 1
        var c : Int = 1
        var d : Int = 4

        var cabe: Int
        var rota: Int

        if ((d <= b) && (c <= a)){
            cabe = 2
            rota = 0
        }
        else if ((b <= d) && (a <= c)){
            cabe = 1
            rota = 0
        }
        else if((c <= b) && (d <= a)){
            cabe = 2
            rota = 1
        }
        else if ((b <= c) && (a <= d)){
            cabe = 1
            rota = 1
        }
        else {
            cabe = 0
            rota = 0
        }
        println("Cabe '$cabe' Rota '$rota'")*/
    }
}

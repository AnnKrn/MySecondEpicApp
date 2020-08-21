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

        val mybutonsin = findViewById<Button>(R.id.my_butonsin)
        mybutonsin.setOnClickListener(){
            val text = "I'M FUCKING EPIC!!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        //Gauss
        var a : Int = 1583
        
        var b : Int = a/100 + 1
        var c : Int = ((3*b)/4) - 12
        var e : Int = (a % 19) + 1
        var f : Int = (8*b)+5/(25-(5+c))
        var g : Int = ((5*a)/4) - (c+10)
        var h : Int = ((11*e)+20+f)%30

        if(h == 24){
            h++
        }

        if(e > 11){
            h++
        }

        var i : Int = 44 - h
        if(i < 21){
            i + 30
        }

        var j : Int = i + 7 - ((g+1)%7)

        if(j <= 31){
            println("dia '$j' mes 3")
        }
        else {
            println("dia '${j - 31}' mes 4")
        }

        //Problema 3n+1

        var n : Int = 22
        var x = 1
        var m = 0


        while (n != 1) {
            if(n == 1){
                x++
            }
            else if (n%2 == 1) {
                n = (3*n) + 1
                x++
            }
            else {
                n = (n/2)
                x++
            }

            if(m < n){
                m = n
            }
        }

        println("3n contador '${x}' mayor '${m}'")

        //Divisores
        var N : Int = 6
        var D : Int = 0
        var ix : Int = 1

        while(ix <= N){
            if(N % ix == 0 ){
                D++
            }
            ix++
        }
        println("Divisores '$D'")


        //Conversiones

        /*var centigrado : Int = -1
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
        var m :Int = 6
        var n :Int = 20
        var i :Int = 1

        for (i in m..n) {
            println("Pitagoras '$i'")
        } */
       /*
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

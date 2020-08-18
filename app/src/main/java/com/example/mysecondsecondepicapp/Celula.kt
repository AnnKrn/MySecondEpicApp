package com.example.mysecondsecondepicapp


open class Celula constructor(val citoplasma: Int,  val nucleo: Int){

    var mitocondria: Int = 0
    constructor(citoplasma: Int, nucleo : Int, mitocondria: Int) : this(citoplasma, nucleo){
        this.mitocondria = mitocondria
    }

    open fun imprimir(citoplasma: Int, nucleo : Int){
        println("La culula tiene '${this.nucleo}' nucleo, dentro de '${this.citoplasma}' citoplasma")
    }

    fun imprimir(citoplasma: Int, nucleo : Int, mitocondria : Int){
        println("La culula tiene '${this.nucleo}' nucleo, '${this.mitocondria}' mitocondria y '${this.citoplasma}' citoplasma")
    }
}

open class Eucariota(citoplasma: Int,  nucleo: Int, mitocondria: Int): Celula(citoplasma, nucleo, mitocondria) {
}

open class Procariota(citoplasma: Int,  nucleo: Int, mitocondria: Int): Celula(citoplasma, nucleo, mitocondria) {
}
class CelulaAnimal(citoplasma: Int,  nucleo: Int):Eucariota(citoplasma, nucleo,0){
    override fun imprimir(citoplasma: Int, nucleo: Int) {
        println("Sobre escribí 'imprimir' de Celula")
    }
}

class CelulaVegetal(citoplasma: Int,  nucleo: Int):Eucariota(citoplasma, nucleo,0){
}

fun main( args:Array<String>){

}


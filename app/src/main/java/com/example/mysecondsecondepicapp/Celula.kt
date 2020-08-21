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

open class Procariota(citoplasma: Int,  nucleo: Int): Celula(citoplasma, nucleo) {
}
class CelulaAnimal(citoplasma: Int,  nucleo: Int):Eucariota(citoplasma, nucleo,0){
    override fun imprimir(citoplasma: Int, nucleo: Int) {
        println("Sobre escribí 'imprimir' de Celula")
    }
}

class CelulaVegetal(citoplasma: Int,  nucleo: Int):Eucariota(citoplasma, nucleo,0){
}

fun main( args:Array<String>){

    var celula = Celula(1,3)
    var celular = Celula(1,3,8)
    var eucariota = Eucariota(6,4,8)
    var procariota = Procariota(2,6)
    var animal = CelulaAnimal(3,8)

    println(celula.imprimir(1,2))
    println(animal.imprimir(1,2))
}git add .
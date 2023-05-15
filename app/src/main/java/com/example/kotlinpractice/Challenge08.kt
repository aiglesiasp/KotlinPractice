package com.example.kotlinpractice

class Challenge08 {
/*
 * RETO #8: DECIMAL A BINARIO
 *
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 */

    fun main() {
        println(decimalToBinari(387))
        println(decimalToBinari(0))
    }

    private fun decimalToBinari(decimal: Int) : String {
        var number = decimal
        var binary = ""

        while(number != 0) {
            val reminder = number % 2
            number /= 2
            binary = "$reminder$binary"
        }

        return binary.ifEmpty { "0" }
    }

}
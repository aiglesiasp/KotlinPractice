package com.example.kotlinpractice

class Challenge00 {
/*
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión),
 * sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 */

    fun main() {
        for(index in 1..100) {
            val multThree: Boolean = (index % 3) == 0
            val multFive: Boolean = (index % 5) == 0
            if(multThree && multFive) println("fizzbuzz")
            else if(multThree) println("fizz")
            else if(multFive) println("buzz")
            else println(index)
        }

    }
}
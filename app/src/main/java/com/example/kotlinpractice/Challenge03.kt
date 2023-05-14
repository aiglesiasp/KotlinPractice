package com.example.kotlinpractice

class Challenge03 {
/*
 * RETO #3: ¿ES UN NÚMERO PRIMO?
 *
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 */

    fun main() {
        for(index in 1..100) {
            if(checkPrime(index)) println(index)
        }
    }

    private fun checkPrime(num: Int) : Boolean {
        var count = 0
        for(index in 2 until num) {
            if(num % index == 0) return false
        }
        return true
    }
}
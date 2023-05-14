package com.example.kotlinpractice

class Challenge02 {
/*
 * RETO #2: LA SUCESIÓN DE FIBONACCI
 *
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

    // FIRST OPTION
    fun fibonacci1() {
        var num1: Long = 0
        var num2: Long = 1
        for(index in 1..50) {
            if(index == 1) {
                println(num1)
            } else {
                var result = num1 + num2
                num1 = num2
                num2 = result
                println(result)
            }
        }
    }

    // SECOND OPTION
    fun fibonacci2() {
        var n0: Long = 0
        var n1: Long = 1

        (1..50).forEach { _ ->

            println(n0)

            val fib = n0 + n1
            n0 = n1
            n1 = fib
        }
    }
}
package com.example.kotlinpractice

class Challenge06 {
/*
 * RETO #6: INVIRTIENDO CADENAS
 *
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 */

    fun main() {
        println(reverse("Hola mundo"))
    }

    private fun reverse(text: String): String {
        val textCount = text.count() - 1
        var reversedText = ""
        for (index in 0..textCount) {
            reversedText += text[textCount - index]
        }
        return reversedText
    }
}
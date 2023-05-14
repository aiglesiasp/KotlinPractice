package com.example.kotlinpractice

class Challenge01 {
/*
 * RETO #1: ¿ES UN ANAGRAMA?
 *
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 *
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 *
 * - NO hace falta comprobar que ambas palabras existan.
 *
 * - Dos palabras exactamente iguales no son anagrama.
 */

    fun isAnagram(firstWord: String, secondWord: String): Boolean {
        if (firstWord.lowercase() == secondWord.lowercase()) {
            return false
        }
        return firstWord.lowercase().toCharArray().sortedArray()
            .contentEquals(secondWord.lowercase().toCharArray().sortedArray())
    }
}
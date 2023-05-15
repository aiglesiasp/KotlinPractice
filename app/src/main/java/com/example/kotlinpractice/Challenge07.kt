package com.example.kotlinpractice

class Challenge07 {
/*
 * RETO #7: CONTANDO PALABRAS
 *
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 *
 */

    fun main() {
        countWords("Hola, mi nombre es aitor. Mi nombre completo es Aitor Iglesias")
    }

    private fun countWords(text: String) {

        val words = mutableMapOf<String, Int>()

        text.lowercase().replace("[^a-z0-9]".toRegex(), " ").split(" ").forEach { key ->
            if (key.isEmpty()) {
                return@forEach
            }
            if (words[key] != null) {
                words[key] = words.getValue(key) + 1
            } else {
                words[key] = 1
            }
        }

        words.forEach { word ->
            println("${word.key} se ha repetido ${word.value} ${if(word.value == 1) "vez" else "veces"}")
        }
    }

}
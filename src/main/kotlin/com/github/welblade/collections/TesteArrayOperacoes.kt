package com.github.welblade.collections

fun main() {
    val wages = doubleArrayOf(1000.0, 740.0, 2250.0, 4000.0)

    wages.forEachIndexed { index, d -> print("[$index] = $d, ") }

    println("\n----------------------------------------")
    println("Maior salário:  ${wages.maxOrNull()}")
    println("Menor salário:  ${wages.minOrNull()}")
    println("Média salarial: ${wages.average()}")

    println("----------------------------------------")
    val wagesGreaterThan2k = wages.filter { it > 2000.0 }
    wagesGreaterThan2k.forEachIndexed {  index, d -> print("[$index] = $d, ") }
}
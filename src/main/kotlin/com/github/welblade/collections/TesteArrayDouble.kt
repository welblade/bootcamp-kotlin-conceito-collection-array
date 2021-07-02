package com.github.welblade.collections

fun main() {
    val wages = DoubleArray(3)
    wages[0] = 1000.0
    wages[1] = 3000.0
    wages[2] = 500.0

    println("Salários sem modificação")
    wages.forEach { print("$it, ") }
    println("\n-----------------------------------------")
    println("Salários com aumento de 25,69%")
    wages.forEachIndexed { index, wage ->  wages[index] = wage * 1.2569 }
    wages.forEach { print(String.format("%.2f . ", it)) }
    println("\n-----------------------------------------")

    val wagesOf = doubleArrayOf(2000.0, 650.0, 5800.0, 985.25)
    wagesOf.sort()
    println("Salários sem modificação mas ordenados")
    wagesOf.forEachIndexed { index, salary -> print("[$index] = $salary, ") }

}
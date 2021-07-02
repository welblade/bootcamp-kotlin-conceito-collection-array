package com.github.welblade.collections

fun main() {
    val joao = Worker("João", 2000.0, "CLT")
    val pedro = Worker("Pedro", 1000.0, "CLT")
    val maria = Worker("Maria", 4000.0, "PJ")

    val workers1 = setOf(joao, pedro)
    val workers2 = setOf(maria)

    val workers3 = workers1.union(workers2)
    workers3.forEach(::println)
    println("-------------------------------------")
    val subtracted = workers3.subtract(workers2)
    subtracted.forEach(::println)
    println("-------------------------------------")
    val intersected = workers3.intersect(workers2)
    intersected.forEach(::println)
}
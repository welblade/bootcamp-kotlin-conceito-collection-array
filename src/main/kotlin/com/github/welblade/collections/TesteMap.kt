package com.github.welblade.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1500.0)
    val map1 = mapOf( pair )
    map1.forEach { (s, d) -> println("$s -> $d") }

    val map2 = mapOf(
        "João" to 1500.0,
        "Maria" to 2000.0,
        "Pedro" to 3000.0
    )
    println("--------------------------------------")
    map2.forEach { println(it) }
}
package com.github.welblade.collections

fun main() {
    val values = intArrayOf(5, 6, 7, 1, 3, 2)
    println("Iteração pelos indices com FOR")
    values.sort()
    for (indice in values.indices){
        print("[$indice] = ${values[indice]}, ")
    }
}
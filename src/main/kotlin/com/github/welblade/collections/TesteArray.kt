package com.github.welblade.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 4
    values[2] = 2
    values[3] = 5
    values[4] = 1

    println("Iteração com FOR")
    for (value in values){
        print("$value, ")
    }
    println("\n---------------------------------------------")
    println("Iteração com FOREACH")
    values.forEach {
            value -> print("$value, ")
    }
    println("\n---------------------------------------------")

    println("Iteração pelos indices com FOR")
    for (indice in values.indices){
        print("[$indice] = ${values[indice]}, ")
    }
    println("\n---------------------------------------------")

    println("Iteração pelos indices com FOR mas depois de ordenar o array")
    values.sort()
    for (indice in values.indices){
        print("[$indice] = ${values[indice]}, ")
    }
    println("\n---------------------------------------------")
}
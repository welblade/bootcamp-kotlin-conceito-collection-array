package com.github.welblade.collections

fun main() {
    val names = arrayOf("João", "Maria", "David", "Jeremias", "Monalisa")

    names.sort()
    for (indice in names.indices){
        print("[$indice] = ${names[indice]}, ")
    }
}
package com.github.welblade.collections

fun main() {
    val bigDecimalsValues = arrayOf(
        "2000".toBigDecimal(),
        "4000".toBigDecimal(),
        "5000".toBigDecimal(),
        "3000".toBigDecimal(),
    )

    println("------------------------------------")
    println("Somatória: ${bigDecimalsValues.somatoria()}")
    println("------------------------------------")
    println("Média:     ${bigDecimalsValues.media()}")
}
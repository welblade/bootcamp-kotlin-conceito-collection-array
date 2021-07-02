package com.github.welblade.collections

data class Worker (
    val name: String,
    val wage: Double,
    val contractType: String
){
    override fun toString(): String {
        return """
            Nome:    $name
            Salário: $wage
        """.trimIndent()
    }
}

fun main() {
    val joao = Worker("João", 2000.0, "CLT")
    val pedro = Worker("Pedro", 1000.0, "CLT")
    val maria = Worker("Maria", 4000.0, "PJ")

    val workers = listOf(joao, pedro, maria)
    workers.forEach { println(it) }
    println("------------------------------------")
    val findMary = workers.find { it.name == "Maria" }
    println( findMary )
    println("------------------------------------")
    workers
        .sortedBy { it.wage }
        .forEach { println(it) }
    println("------------------------------------")
    workers
        .groupBy { it.contractType }
        .forEach { println(it) }
}
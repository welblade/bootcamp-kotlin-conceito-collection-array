package com.github.welblade.collections

fun main() {
    val joao = Worker("João", 2000.0, "CLT")
    val pedro = Worker("Pedro", 1000.0, "CLT")
    val maria = Worker("Maria", 4000.0, "PJ")

    val repository = Repository<Worker>()
    repository.create(joao.name, joao)
    repository.create(maria.name, maria)
    repository.create(pedro.name, pedro)

    println(repository.findById(joao.name))
}
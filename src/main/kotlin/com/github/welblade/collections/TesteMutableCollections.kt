package com.github.welblade.collections

fun main() {

    val joao = Worker("João", 2000.0, "CLT")
    val pedro = Worker("Pedro", 1000.0, "CLT")
    val maria = Worker("Maria", 4000.0, "PJ")

    println("-----------------[LIST]-----------------")
    val mutableList = mutableListOf(joao, pedro)
    mutableList.forEach(::println)
    println("----------------------------------------")
    mutableList.add(maria)
    mutableList.forEach(::println)
    println("----------------------------------------")
    mutableList.remove(pedro)
    mutableList.forEach(::println)
    println("------------------[SET]-----------------")
    val mutableSet = mutableSetOf(joao)
    mutableSet.forEach(::println)
    println("----------------------------------------")
    mutableSet.add(maria)
    mutableSet.add(pedro)
    mutableSet.forEach(::println)
    println("----------------------------------------")
    mutableSet.remove(maria)
    mutableSet.forEach(::println)


}
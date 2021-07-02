package com.github.welblade.collections

class Repository<T> {
    private val storage: MutableMap<String, T> = mutableMapOf()

    fun create(id:String, value: T){
        storage[id] = value
    }

    fun findById(id:String): T? = storage[id]
}
package com.github.welblade.collections

class Repository<T> {
    private val storage: MutableMap<String, T> = mutableMapOf()

    fun create(id:String, value: T){
        if(id.isNotBlank())
        storage[id] = value
    }
    fun delete(id:String) = storage.remove(id)

    fun findAll() = storage.values

    fun findById(id:String) = storage[id]
}
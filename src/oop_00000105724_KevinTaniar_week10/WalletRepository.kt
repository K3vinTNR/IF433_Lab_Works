package oop_00000105724_KevinTaniar_week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) { items.add(item) }
    fun getAll(): List<T> { return items }
}
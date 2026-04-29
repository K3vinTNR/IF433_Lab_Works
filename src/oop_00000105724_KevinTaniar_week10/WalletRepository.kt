package oop_00000105724_KevinTaniar_week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) { items.add(item) }
    fun getAll(): List<T> { return items }
    // Contoh implementasi pencarian sederhana dengan constraint Any [cite: 116, 117]
    fun find(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}
package oop_00000105724_KevinTaniar_week10

// Membatasi hanya tipe Number (Int, Double, dll)
class MathBox<T: Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
    // Menggunakan where clause untuk batasan Comparable

}
fun <T> getMax(a: T, b: T): T where T: Comparable<T> {
    return if (a > b) a else b
}
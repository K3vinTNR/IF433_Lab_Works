package oop_00000105724_KevinTaniar_week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100) // Tipe data otomatis menjadi Int
    val stringBox = Box("Generics in Kotlin") // Tipe data otomatis menjadi String

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")
}
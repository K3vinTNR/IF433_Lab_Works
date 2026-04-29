package oop_00000105724_KevinTaniar_week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100) // Tipe data otomatis menjadi Int
    val stringBox = Box("Generics in Kotlin") // Tipe data otomatis menjadi String

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}
package oop_00000105724_KevinTaniar_week13

import java.io.File

fun main() {
    println("=== TEST WRITE FILE ===")
    val file = File("sample.txt")
    file.writeText("Hello, this is a basic text file written using Kotlin extension functions.\n")
    println("File berhasil ditulis!")
}
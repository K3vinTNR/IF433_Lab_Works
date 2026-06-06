package oop_00000105724_KevinTaniar_week13

import java.io.File

fun main() {
    println("=== TEST BUFFERED WRITER ===")
    val bufferedFile = File("buffered_sample.txt")

    // .use secara otomatis akan menutup stream setelah selesai dijalankan
    bufferedFile.bufferedWriter().use { writer ->
        writer.write("Line 1: High-performance text streaming.\n")
        writer.write("Line 2: Handled efficiently with internal buffer.\n")
    }
    println("Penulisan buffered selesai!")
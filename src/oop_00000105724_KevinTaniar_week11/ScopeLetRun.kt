package oop_00000105724_KevinTaniar_week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}") // 'this' merujuk pada "Kotlin"
        this.length * 2 // Kalkulasi
    }
    println("Hasil kalkulasi run: $result")
}
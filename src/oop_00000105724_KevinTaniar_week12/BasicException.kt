package oop_00000105724_KevinTaniar_week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    // try langsung mengembalikan nilai
    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }
    println("Hasil parsing: $result")
}
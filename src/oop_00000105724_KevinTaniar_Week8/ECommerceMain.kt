package oop_00000105724_KevinTaniar_Week8


fun main() {
    val parser = ApiParser()
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID! [cite: 235]
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type [cite: 236]
    )

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Log Peringatan: ${e.message}")
        }
    }
}
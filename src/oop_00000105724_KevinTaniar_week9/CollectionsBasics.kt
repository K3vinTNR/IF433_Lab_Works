package oop_00000105724_KevinTaniar_week9

fun main() {
    println("=== TEST LIST ===")
    // Immutable List: Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // Error jika tidak dikomentari [cite: 18]
    println("Immutable List: $frameworks")

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Output: [1, 2, 3, 4] [cite: 32]

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada [cite: 35]
    println("Active Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" // Value boleh duplikat, Key tidak [cite: 45]
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 // Menambah data [cite: 48]
    inventory["Apples"] = 45  // Mengupdate data [cite: 49]
    println("Inventory: $inventory")
}
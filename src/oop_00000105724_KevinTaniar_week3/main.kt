package oop_00000105724_KevinTaniar_week3

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    println("--- Test Salary Validation ---")
    e.salary = -1000 // Akan mencetak error dan set ke 0
    e.salary = 5000000

    // 2. Test Encapsulation & Performance
    println("\n--- Test Performance ---")
    e.increasePerformance()

    // 3. Test Output Akhir
    println("\n--- Final Status ---")
    e.printStatus()
    println("Pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Sword")

    weapon.damage = -50
    weapon.damage = 9999

    println(weapon.damage)
    println(weapon.tier)
    val player = Player("Kevin")

// player.xp   // harus error

    player.addXp(50)
    println(player.level)

    player.addXp(60)
    println(player.level)
}
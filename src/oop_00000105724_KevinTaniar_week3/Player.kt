package oop_00000105724_KevinTaniar_week3

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount
            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        }
    }
}
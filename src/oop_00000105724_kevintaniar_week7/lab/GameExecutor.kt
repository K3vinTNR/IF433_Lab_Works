package oop_00000105724_kevintaniar_week7.lab

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! Ada ${event.monsterName} muncul!")
        is LootDropped -> {
            val (name, _, rarity) = event.item // Destructuring
            println("Hore! Mendapatkan loot: $name [Rarity: $rarity]")
        }
        is GameOver -> println("Permainan Berakhir: ${event.reason}")
        is SafeZone -> println("Kamu berada di zona aman. Silakan beristirahat.")
    }
}
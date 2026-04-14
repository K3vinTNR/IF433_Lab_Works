package oop_00000105724_kevintaniar_week7.lab

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword(): Weapon {
            return Weapon(GameItem("Excalibur Lite", 50, ItemRarity.EPIC), 100)
        }
    }
}
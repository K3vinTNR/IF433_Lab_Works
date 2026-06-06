package oop_00000105724_KevinTaniar_week14

open class BaseBird {
    open fun eat() { println("Eating seeds.") }
}

interface FlyingBird {
    fun fly()
}

class Eagle : BaseBird(), FlyingBird {
    override fun fly() { println("Eagle soaring high!") }
}

class Penguin : BaseBird() {
    override fun eat() { println("Penguin catching fish.") }
}
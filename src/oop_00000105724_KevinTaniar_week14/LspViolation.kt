package oop_00000105724_KevinTaniar_week14

open class Bird {
    open fun fly() { println("Flying high!") }
}

class Ostrich : Bird() {
    override fun fly() {
        throw UnsupportedOperationException("Ostriches cannot fly!")
    }
}
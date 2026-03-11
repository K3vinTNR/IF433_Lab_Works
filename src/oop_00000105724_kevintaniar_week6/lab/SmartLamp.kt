package oop_00000105724_kevintaniar_week6.lab

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name (ID: $id) menyala.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}
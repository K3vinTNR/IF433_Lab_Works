package oop_00000105724_kevintaniar_week6.lab

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name menyala.")
    }

    override fun turnOff() {
        println("Speaker $name mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}
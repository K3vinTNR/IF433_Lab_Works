package oop_00000105724_kevintaniar_week6.lab

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}
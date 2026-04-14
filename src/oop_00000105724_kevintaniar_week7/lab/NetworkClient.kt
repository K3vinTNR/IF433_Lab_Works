package oop_00000105724_kevintaniar_week7.lab

class NetworkClient private constructor (val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}
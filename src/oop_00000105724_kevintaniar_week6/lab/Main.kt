package oop_00000105724_kevintaniar_week6.lab

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    // Pengujian Latihan Terbimbing sebelumnya (Checkpoint 3, 6, 9)
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    println("\n=== TESTING CHECKOUT ===")

    processCheckout(Gopay(), 50000.0)
    processCheckout(CreditCard(), 150000.0)
    val hub = SmartHomeHub()
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
}
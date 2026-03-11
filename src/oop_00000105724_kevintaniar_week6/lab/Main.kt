package oop_00000105724_kevintaniar_week6.lab

// Fungsi ini adalah contoh Decoupling & Polymorphism
// Ia tidak peduli apakah yang datang Gopay atau CreditCard, selama mematuhi kontrak PaymentMethod
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

    // CHECKPOINT 12: Testing Checkout System
    println("\n=== TESTING CHECKOUT ===")

    // Memasukkan objek yang berbeda ke fungsi yang sama
    processCheckout(Gopay(), 50000.0)
    processCheckout(CreditCard(), 150000.0)
}
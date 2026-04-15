package oop_00000105724_KevinTaniar_Week8

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Menarik data secara berantai (chained)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui";
    println("Tujuan pengiriman: $destination")
}
package oop_00000105724_KevinTaniar.week1

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750_000
    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int) =
    if (price > 500_000) price * 80 / 100
    else price * 90 / 100
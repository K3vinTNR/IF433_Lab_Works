package oop_00000105724_KevinTaniar.week1

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750_000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan"
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500_000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(
    title: String,
    originalPrice: Int,
    finalPrice: Int,
    note: String
) {
    println("=== SteamKW Digital Receipt ===")
    println("Judul Game   : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : $note")
}

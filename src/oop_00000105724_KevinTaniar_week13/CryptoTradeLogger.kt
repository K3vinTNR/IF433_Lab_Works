package oop_00000105724_KevinTaniar_week13

import java.io.File

fun main() {
    println("=== INITIALIZING CRYPTO TRADES ===")
    val initialTrades = mutableListOf(
        CryptoTrade("TX101", "BTC", "BUY", 150.50),
        CryptoTrade("TX102", "ETH", "SELL", -45.20),
        CryptoTrade("TX103", "SOL", "BUY", 320.00)
    )
    val tradeFile = File("trades.csv")
    tradeFile.writeText(initialTrades.toCsvFormat())
    println("Data transaksi awal berhasil disimpan ke trades.csv.")
}
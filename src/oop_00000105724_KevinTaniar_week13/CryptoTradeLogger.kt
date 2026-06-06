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

    // Menambahkan baris rusak secara sengaja (format PnL bukan angka/Double yang valid)
    tradeFile.appendText("TX104,DOGE,BUY,ERROR_VAL\n")
    println("Anomalous trade record appended.")
}
fun loadTradesFromCsv(file: File): List<CryptoTrade> {
    val trades = mutableListOf<CryptoTrade>()
    if (!file.exists()) return trades

    file.bufferedReader().use { reader ->
        val header = reader.readLine() // Lewati baris header
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            if (line.isNullOrBlank()) continue
            try {
                val tokens = line!!.split(",")
                if (tokens.size == 4) {
                    val id = tokens[0].trim()
                    val asset = tokens[1].trim()
                    val type = tokens[2].trim()
                    val pnl = tokens[3].trim().toDouble() // Berpotensi melempar NumberFormatException
                    trades.add(CryptoTrade(id, asset, type, pnl))
                }
            } catch (e: Exception) {
                println("[WARNING] Melewati baris rusak akibat error: ${e.message}")
            }
        }
    }
    return trades
}
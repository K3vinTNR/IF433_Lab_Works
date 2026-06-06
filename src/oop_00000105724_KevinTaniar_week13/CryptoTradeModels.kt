package oop_00000105724_KevinTaniar_week13

data class CryptoTrade(val id: String, val asset: String, val type: String, val pnl: Double)

fun List<CryptoTrade>.toCsvFormat(): String {
    val sb = StringBuilder()
    sb.append("ID,Asset,Type,PnL\n")
    for (trade in this) {
        sb.append("${trade.id},${trade.asset},${trade.type},${trade.pnl}\n")
    }
    return sb.toString()
}
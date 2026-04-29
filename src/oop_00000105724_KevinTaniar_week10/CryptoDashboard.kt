package oop_00000105724_KevinTaniar_week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    response.data.forEach { println("Coin: ${it.name}, Balance: ${it.balance}") }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 100.0))
    txRepo.add(Transaction("TX002", 50.0))
}
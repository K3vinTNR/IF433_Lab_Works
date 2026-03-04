package oop_00000105724_kevintaniar_week5.Lab

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar Rp$amount sukses.")
        } else {
            println("[$accountName] Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil top up Rp$amount. Saldo sekarang: Rp$balance")
    }
}
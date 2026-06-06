package oop_00000105724_KevinTaniar_week14

class FinancialCalculator {
    fun calculateTotal(price: Double, taxRate: Double): Double = price + (price * taxRate)
}

class InvoiceRepository {
    fun saveToFile(invoiceId: String, total: Double) {
        println("Saving invoice $invoiceId with total $total securely via SRP.")
    }
}

class NotificationSender {
    fun sendEmail(email: String) {
        println("Notification email sent to $email via SRP.")
    }
}

fun main() {
    println("=== TEST SRP ARCHITECTURE ===")
    val calc = FinancialCalculator()
    val repo = InvoiceRepository()
    val notifier = NotificationSender()

    val total = calc.calculateTotal(500000.0, 0.11)
    repo.saveToFile("INV-2026-001", total)
    notifier.sendEmail("kevin.taniar@student.umn.ac.id")
}
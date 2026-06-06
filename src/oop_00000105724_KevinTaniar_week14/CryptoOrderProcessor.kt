package oop_00000105724_KevinTaniar_week14

import java.io.File

// --- 1. SRP & DIP Abstractions ---
interface OrderRepository {
    fun saveOrder(orderId: String, finalPrice: Double)
}

interface NotificationService {
    fun sendNotification(message: String)
}

// --- 2. Concrete Implementations ---
class CsvOrderRepository : OrderRepository {
    override fun saveOrder(orderId: String, finalPrice: Double) {
        File("orders.csv").bufferedWriter().use { writer ->
            writer.write("OrderID,FinalPrice\n")
            writer.write("$orderId,$finalPrice\n")
        }
        println("[REPO] Order $orderId saved successfully to orders.csv.")
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("[NOTIF] Email alert sent: $message")
    }
}

// --- 3. Refactored High-Level Bot Client Class ---
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService,
    private val pricingStrategy: PricingStrategy
) {
    fun processOrder(orderId: String, basePrice: Double) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        repo.saveOrder(orderId, finalPrice)
        notifier.sendNotification("Order $orderId has been processed with final total of $$finalPrice.")
    }
}
// --- 4. OCP Abstractions & Pricing Strategies ---
interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90 // Diskon 10%
}

// --- 5. Main Execution Pipeline ---
fun main() {
    println("\n=== TESTING SOLID CRYPTO ORDER BOT ===")

    val repository = CsvOrderRepository()
    val notification = EmailNotifier()
    val vipStrategy = VipPricing()

    // Membangun arsitektur bot yang tangguh dengan injeksi dependensi
    val botProcessor = SafeOrderProcessor(repository, notification, vipStrategy)

    // Menjalankan pipeline eksekusi
    botProcessor.processOrder("TX-SOLID-99", 5000.0)
    println("=========================================")
}
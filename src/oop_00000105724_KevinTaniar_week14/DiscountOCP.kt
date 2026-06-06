package oop_00000105724_KevinTaniar_week14

class DiscountManager {
    fun applyDiscount(customerType: String, price: Double): Double {
        return when (customerType) {
            "REGULAR" -> price * 0.95
            "VIP" -> price * 0.85
            else -> price
        }
    }
}
interface DiscountPolicy {
    fun extractDiscount(price: Double): Double
}

class RegularPolicy : DiscountPolicy {
    override fun extractDiscount(price: Double): Double = price * 0.95
}

class VipPolicy : DiscountPolicy {
    override fun extractDiscount(price: Double): Double = price * 0.85
}
class VvipPolicy : DiscountPolicy {
    override fun extractDiscount(price: Double): Double = price * 0.75
}
class OrderPriceEvaluator(private val policy: DiscountPolicy) {
    fun finalCost(price: Double): Double = policy.extractDiscount(price)
}

fun main() {
    println("\n=== TEST OCP PIPELINE ===")
    val vvipEvaluator = OrderPriceEvaluator(VvipPolicy())
    println("Harga akhir VVIP: Rp${vvipEvaluator.finalCost(100000.0)}")
}
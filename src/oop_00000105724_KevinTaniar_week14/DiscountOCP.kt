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
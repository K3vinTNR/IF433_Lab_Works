package oop_00000105724_kevintaniar_week5.Lab

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}